package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainV3 {
    public static void hello(Process process) {
        System.out.println("프로그램 시작");
        process.run();
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        hello(new Process() {
            @Override
            public void run() {
                int random = new Random().nextInt(6) + 1;
                System.out.println("random: " + random);
            }
        });
        hello(new Process() {
            @Override
            public void run() {
                int sum = 0;
                for (int i = 0; i < 10; i++) {
                    sum += i;
                }
                System.out.println("sum: " + sum);
            }
        });
    }
}

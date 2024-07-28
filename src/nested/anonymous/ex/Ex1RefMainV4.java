package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainV4 {
    public static void hello(Process process) {
        System.out.println("프로그램 시작");
        process.run();
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        hello(() -> {
            int random = new Random().nextInt(6) + 1;
            System.out.println("random: " + random);
        });
        hello(() -> {
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
            }
            System.out.println("sum: " + sum);
        });
    }
}

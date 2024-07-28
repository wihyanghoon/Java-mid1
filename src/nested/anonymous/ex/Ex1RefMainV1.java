package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainV1 {
    static class Dice implements Process {
        @Override
        public void run() {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("randomValue: " + randomValue);
        }
    }

    static class Sum implements Process {
        @Override
        public void run() {
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum = sum + i;
            }
            System.out.println("sum: " + sum);
        }
    }
    public static void hello(Process process) {
        System.out.println("프로그램 시작");
        process.run();
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        Dice dice = new Dice();
        Sum sum = new Sum();

        hello(dice);
        hello(sum);
    }
}

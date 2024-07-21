package lang.math;

import java.util.Random;

public class RandomMain {
    public static void main(String[] args) {
        // Random random = new Random();
        Random random = new Random(1); // seed가 같은 Random의 결과가 같다.

        int randomInt = random.nextInt();
        System.out.println("randomInt: " + randomInt);

        double randomDouble = random.nextDouble();
        System.out.println("randomDouble: " + randomDouble);

        boolean randomBoolean = random.nextBoolean();
        System.out.println("randomBoolean: " + randomBoolean);

        //범위조회
        int randomRange = random.nextInt(10); // 0 ~ 9 까지 랜덤 출력
        System.out.println("randomRange: " + randomRange);

        int randomRange2 = random.nextInt(10) + 1;
        System.out.println("randomRange2: " + randomRange2);
    }
}

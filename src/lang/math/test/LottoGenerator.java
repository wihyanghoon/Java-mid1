package lang.math.test;

import java.util.Random;

public class LottoGenerator {
    private final Random rand = new Random();
    private int[] lottoNumbers;
    private int count;

    public int[] generate() {
        lottoNumbers = new int[6];
        count = 0;

        while (count < 6) {
            // 1부터 45 사이의 숫자 생성
            int number = rand.nextInt(45) + 1;
            // 중복이 아닌 경우에만
            if(this.isUnique(number)) {
                lottoNumbers[count] = number;
                count++;
            }
        }
        return lottoNumbers;
    }

    // 중복 숫자인지 검사
    private boolean isUnique(int number) {
        for (int i = 0; i < count; i++) {
            if (number == lottoNumbers[i]) {
                return false;
            }
        }
        return true;
    }
}

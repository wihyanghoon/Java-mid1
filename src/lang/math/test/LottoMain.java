package lang.math.test;

public class LottoMain {
    public static void main(String[] args) {
        LottoGenerator lotto = new LottoGenerator();
        int[] lottoNumbers = lotto.generate();

        System.out.print("로또 번호는 : ");
        for (int number : lottoNumbers) {
            System.out.print(number + " ");
        }
    }
}

package time2;

import java.time.LocalTime;

public class LocalTimeMain {
    public static void main(String[] args) {
        LocalTime nowTime = LocalTime.now();
        LocalTime ofTime = LocalTime.of(23, 59, 59);

        System.out.println("현재시간 = " + nowTime);
        System.out.println("지정시간 = " + ofTime);

        //계산 불변 객체
        LocalTime ofTimePlus = ofTime.plusHours(1);
        System.out.println("after plus = " + ofTimePlus);
    }
}

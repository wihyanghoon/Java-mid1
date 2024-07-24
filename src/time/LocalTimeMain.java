package time;

import java.time.LocalTime;

public class LocalTimeMain {
    public static void main(String[] args) {
        LocalTime nowTime = LocalTime.now();
        LocalTime ofTime = LocalTime.of(23, 59, 59);

        System.out.println("현재 시간 = " + nowTime);
        System.out.println("지정 시간 = " + ofTime);

        //계산
        ofTime = ofTime.plusHours(1);
        System.out.println("지정 시간 + 1hour = " + ofTime);
    }
}

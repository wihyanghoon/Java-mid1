package time;

import java.time.LocalDate;

public class LocalDateMain {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate ofDate = LocalDate.of(2013, 11, 21);

        System.out.println("오늘날짜 = " + now);
        System.out.println("지정날짜 = " + ofDate);

        // 시간 계산
        // time은 불변 객체임을 인지하자
        ofDate = ofDate.plusDays(10);
        System.out.println("ofDate = " + ofDate);
    }
}

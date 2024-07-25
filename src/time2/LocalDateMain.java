package time2;

import java.time.LocalDate;

public class LocalDateMain {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        LocalDate ofDate = LocalDate.of(2024, 7, 25);

        System.out.println("오늘 날짜 = " + nowDate);
        System.out.println("지정 날짜 = " + ofDate);

        //계산
        LocalDate plusDays = nowDate.plusDays(1);

        System.out.println("plusDays = " + plusDays);
    }
}

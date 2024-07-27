package time2;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class getTimeMain {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2030,1,1,13,30,59);
        System.out.println("YEAR = " + dt.get(ChronoField.YEAR));
        System.out.println("MONTH = " + dt.get(ChronoField.MONTH_OF_YEAR));
        System.out.println("DAY = " + dt.get(ChronoField.DAY_OF_MONTH));
        System.out.println("HOUR = " + dt.get(ChronoField.HOUR_OF_DAY));
        System.out.println("MINUTE = " + dt.get(ChronoField.MINUTE_OF_HOUR));
        System.out.println("SECOND = " + dt.get(ChronoField.SECOND_OF_MINUTE));

        System.out.println("편의 메서드 제공");
        System.out.println("YEAR = " + dt.getYear());
        System.out.println("MONTH = " + dt.getMonthValue());
        System.out.println("DAY = " + dt.getDayOfMonth());
        System.out.println("HOUR = " + dt.getHour());
        System.out.println("MINUTE = " + dt.getMinute());
        System.out.println("SECOND = " + dt.getSecond());

        System.out.println("편의 메서드에 없음");
        System.out.println("MINUTE_OF_DAY = " + dt.get(ChronoField.MINUTE_OF_DAY));
        System.out.println("SECOND_OF_DAY = " + dt.get(ChronoField.SECOND_OF_DAY));
    }
}

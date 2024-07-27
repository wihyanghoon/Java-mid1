package time2;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class IsSupportedMain2 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        // 컴파일 오류
        // int minute = now.get(ChronoField.MINUTE_OF_DAY);
        // System.out.println("Minute: " + minute);
    }
}

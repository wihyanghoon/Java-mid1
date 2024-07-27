package time2;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class IsSupportedMain1 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        boolean isSupported = now.isSupported(ChronoField.SECOND_OF_MINUTE);
        System.out.println("isSupported: " + isSupported);

        if (isSupported) {
            int minute = now.get(ChronoField.SECOND_OF_MINUTE);
            System.out.println("minute: " + minute);
        }
    }
}

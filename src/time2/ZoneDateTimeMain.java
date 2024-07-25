package time2;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTimeMain {
    public static void main(String[] args) {
        ZonedDateTime nowZdt = ZonedDateTime.now();
        System.out.println("Now: " + nowZdt);

        LocalDateTime ldt = LocalDateTime.of(2030,7,25,9,0,0);
        ZonedDateTime zdt1 = ZonedDateTime.of(ldt, ZoneId.of("Asia/Seoul"));
        System.out.println("zdt1: " + zdt1);

        ZonedDateTime zdt2 = ZonedDateTime.of(2030,
                7,
                25,
                9,
                0,
                0,
                0,
                ZoneId.of("Asia/Seoul"));

        System.out.println("zdt2: " + zdt2);

        ZonedDateTime utcZdt = zdt2.withZoneSameInstant(ZoneId.of("UTC"));
        System.out.println("utcZdt: " + utcZdt);
    }
}

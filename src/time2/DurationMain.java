package time2;

import java.time.Duration;
import java.time.LocalTime;

public class DurationMain {
    public static void main(String[] args) {
        Duration duration = Duration.ofMinutes(30);
        System.out.println("duration: " + duration);

        LocalTime lt = LocalTime.of(1,0);
        System.out.println("lt: " + lt);

        // 계산에 사용
        LocalTime plusTime = lt.plus(duration);
        System.out.println("plusTime: " + plusTime);

        // 시간 차이
        LocalTime startTime = LocalTime.of(1,0);
        LocalTime endTime = LocalTime.of(2,0);
        Duration between = Duration.between(startTime, endTime);
        System.out.println("between: " + between);
        System.out.println("차이: " + between.getSeconds() + "초");
        System.out.println("근무시간: " + between.toHours() + "시간" + between.toMinutesPart() + "분");
    }
}

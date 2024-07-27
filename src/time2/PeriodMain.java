package time2;

import java.time.LocalDate;
import java.time.Period;

public class PeriodMain {
    public static void main(String[] args) {
        //생성
        Period period = Period.ofDays(10);
        System.out.println("Period: " + period);

        //계산에 사용
        LocalDate currentDate = LocalDate.of(2030,1,1);
        LocalDate plusDate = currentDate.plus(period);
        System.out.println("currentDate: " + currentDate);
        System.out.println("plusDate: " + plusDate);

        //기찬 차이
        LocalDate statDate = LocalDate.of(2030,1,1);
        LocalDate endDate = LocalDate.of(2030,4,2);
        Period between = Period.between(statDate, endDate);
        System.out.println("between: " + between);
        System.out.println("기간: " + between.getMonths() + "개월 " + between.getDays() +"일");
    }
}

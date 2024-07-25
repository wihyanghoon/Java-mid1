package time2;

import java.time.ZoneId;

public class ZoneIdMain {
    public static void main(String[] args) {
        for(String availableZoneId : ZoneId.getAvailableZoneIds()) {
            ZoneId zoneId = ZoneId.of(availableZoneId);
            System.out.println(zoneId + " | " + zoneId.getRules());
        }

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("systemDefault = " + zoneId);

        ZoneId saoZoneId = ZoneId.of("America/Sao_Paulo");
        System.out.println("America/Sao_Paulo = " + saoZoneId);
    }
}

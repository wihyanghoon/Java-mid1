package time;

import java.time.ZoneId;

public class ZonIdMain {
    public static void main(String[] args) {
        for (String availableZoneId : ZoneId.getAvailableZoneIds()){
            System.out.println("Available Zone Id: " + availableZoneId);
            ZoneId zoneId = ZoneId.of(availableZoneId);
            System.out.println(zoneId + "|" + zoneId.getRules());
        }

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("ZoneID.systemDefault : " + zoneId);

        ZoneId seoulId = ZoneId.of("Asia/Seoul");
        System.out.println("seoulId " + seoulId);
    }
}

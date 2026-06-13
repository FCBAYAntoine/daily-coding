package com.swjtu.API.Date;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class demo3 {
    static void main(String[] args) {
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(zoneIds);

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);

        Instant i = Instant.now();
        System.out.println(i);
        Instant i1 = Instant.ofEpochMilli(0);
        System.out.println(i1);
        System.out.println(i.atZone(ZoneId.systemDefault()));;

        boolean res1 = i.isBefore(i1);
        System.out.println(res1);

        ZonedDateTime z = ZonedDateTime.now();
        System.out.println(z);

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss EE a");
        String str1 = dtf1.format(z);
        System.out.println(str1);
    }
}

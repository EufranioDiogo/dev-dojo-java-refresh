package org.eufranio.javaoneforall.javacore.Sformatting.test;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;

        //System.out.println(shortIds);
        //System.out.println(ZoneId.systemDefault());
        LocalDateTime now = LocalDateTime.now();
        ZonedDateTime aet = now.atZone(ZoneId.of("America/Sao_Paulo"));
        ZonedDateTime ajb = now.atZone(ZoneId.of("Africa/Johannesburg"));


        System.out.println(now);

        System.out.println(aet);
        System.out.println(ajb);

        Instant instant = Instant.now();
        System.out.println(instant.atZone(ZoneId.of("America/Sao_Paulo")));
        System.out.println(instant.atZone(ZoneId.of("Africa/Johannesburg")));
    }
}

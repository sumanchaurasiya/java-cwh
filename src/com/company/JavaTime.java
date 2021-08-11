package com.company;
import jdk.swing.interop.SwingInterOpUtils;

import java.time.*;
public class JavaTime extends Thread{
    public static void main(String[] args) {
        Clock c = Clock.systemDefaultZone();
        System.out.println(c.getZone());
        System.out.println(c.instant());

        ZoneId z = ZoneId.of("Asia/Calcutta");
        Clock c2 = Clock.system(z);
        Instant i = c2.instant();
        ZonedDateTime t = i.atZone(c2.getZone());
        System.out.println(t.toString());

        Duration d1 = Duration.between(LocalTime.MIN, LocalTime.NOON);
        Duration d2 = Duration.between(LocalTime.MAX, LocalTime.MIN);
        Duration d3 = Duration.between(LocalTime.MIN, LocalTime.MIDNIGHT);
        System.out.println(d1.isNegative());
        System.out.println(d2.isNegative());
        System.out.println(d3.isZero());

        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalDate d4 = LocalDate.parse("2021-06-21");
        LocalDate d5 = LocalDate.parse("2021-06-22");
        LocalDate d6 = LocalDate.parse("2021-06-21");
        System.out.println(d5.equals(d4));
        System.out.println(d6.equals(d4));

        System.out.println(d4.withYear(2000));

        LocalTime t1 = LocalTime.now();
        System.out.println(t1);

        LocalTime t2 = LocalTime.of(13,16,59);
        System.out.println(t2);
        LocalTime t3 = t2.plusHours(5);
        System.out.println(t3);
        LocalTime t4 = t2.minusMinutes(6);
        System.out.println(t4);
        LocalDateTime t5 = LocalDateTime.now();
        System.out.println(t5);
    }
}

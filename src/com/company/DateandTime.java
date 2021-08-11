package com.company;
import java.util.*;
public class DateandTime {
    public static void main(String[] args) {
//        System.out.println(System.currentTimeMillis() / 1000 / 3600 / 24 / 365);
//        System.out.println("max value of long is: " + Long.MAX_VALUE);
//        System.out.println("current time in ms: " + System.currentTimeMillis());

        Date d = new Date();
//        System.out.println(d);

        Date d1 = new Date(162170923677l);
//        System.out.println(d1);

        Date d2 = new Date(2021,6,14);
//        System.out.println(d2.compareTo(d));


//        System.out.println(d2.getTime());
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getSeconds());
        System.out.println(d.getYear());
    }

}

package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Formatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println("The current date is " + dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String myDate = dt.format(df);
        System.out.println("Date after formatting " + myDate);

        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;
        String myDate2 = dt.format(df2);
        System.out.println("Date in ISO format " + myDate2);

        DateTimeFormatter df3 = DateTimeFormatter.ISO_WEEK_DATE;
        String myDate3 = dt.format(df3);
        System.out.println("Date in ISO Week format " + myDate3);

        DateTimeFormatter df4 = DateTimeFormatter.ISO_ORDINAL_DATE;
        String myDate4 = dt.format(df4);
        System.out.println("Date in ISO ordinal format " + myDate4);
    }
}

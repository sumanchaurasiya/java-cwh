package com.company;

import java.util.Locale;

public class StringMethod {
    public static void main(String[] args) {
        String name = "Suman chaurasiya";

        int temp = name.length();
        System.out.println(temp);

        String temp1 = name.toUpperCase();
        System.out.println(temp1);

        String hlo = "          girl        ";
        System.out.println(hlo.trim());

        System.out.println(name.substring(2));
        System.out.println(name.substring(2,7));

        System.out.println(name.replace('s','a'));

        System.out.println(name.startsWith("su"));
        System.out.println(name.endsWith("hi"));

        System.out.println(name.charAt(0));
        System.out.println(name.indexOf('s'));
        System.out.println(name.indexOf('s',12));

        System.out.println(name.lastIndexOf('h',7));


        System.out.println(name.equals("suman chaurasiya"));
        System.out.println(name.equalsIgnoreCase("suman chaurasiya"));
        String hi = "abhaya";
        System.out.println(hi.indexOf('a'));
        System.out.println(hi.lastIndexOf("a"));
        System.out.println(hi.lastIndexOf("a",4));
    }
}

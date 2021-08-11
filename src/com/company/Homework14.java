package com.company;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class Homework14 {
    public static void main(String[] args) {
        //create an array list and store names of 5 students inside it .printt it using for each loop

        ArrayList al = new ArrayList();
        al.add("abhay");
        al.add("anand");
        al.add("suman");
        al.add("harsh");
        al.add("suji");

        for(Object o : al ){
            System.out.println(o);
        }


        //use the date class in java to print the time in following format: 22:34:28


        Date d = new Date();
        System.out.println(d.getHours() + ":" + d.getMinutes() + ":" +d.getSeconds());

        Calendar c = Calendar.getInstance();
        System.out.print(c.get(Calendar.HOUR_OF_DAY ) + ":");
        System.out.print(c.get(Calendar.MINUTE) + ":");
        System.out.print(c.get(Calendar.SECOND));
        System.out.println();

        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("H:m:s");
        String myDate = dt.format(df);
        System.out.println(myDate);


        //create a set in java .try to store duplicate values inside this set
        // and verify that only one instance is stored

        HashSet<Integer> h1 = new HashSet<>();
        h1.add(20);
        h1.add(20);
        h1.add(22);
        h1.add(25);
        h1.add(28);

        System.out.println(h1);

    }
}

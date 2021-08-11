package com.company;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        String hi = "book";
        //print the string in uppercase
        System.out.println(hi.toUpperCase());

        String name = "     BOY    ";
        //replace spaces with underscore
        System.out.println(name.replace(' ','_'));

//        String letter = "dear name,thanks a lot";
        //replace name with user input name
//        Scanner a = new Scanner(System.in);
//        System.out.println("enter your name");
//        String hlo = a.next();
//        System.out.println(letter.replace("name",hlo));

        //detect  double or triple spaces in string
        String test = "this is  a   boll";
        System.out.println(test.indexOf("  "));
        System.out.println(test.indexOf("   "));

        //escape sequence
        String letter = "Dear Suman ,\n \t you are precious. \nThanks!";
        System.out.println(letter);


    }
}

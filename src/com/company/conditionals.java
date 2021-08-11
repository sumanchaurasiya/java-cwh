package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
public class conditionals {
    public static void main(String[] args) {
//        Scanner a = new Scanner(System.in);
//        System.out.println("enter age");
//        int age =  a.nextInt();
//        if (age >= 18) {
//            System.out.println("you can vote");
//        } else {
//            System.out.println("you are not eligible to vote");
//        }
//        >=,==,<=,!=,<,>,relational operators gives true or false
        // &&,||,! logical opt.
//        int adult = 18;
//        Scanner a = new Scanner(System.in);
//        System.out.println("enter your age");
//        int age = a.nextInt();
//        switch (age)
//        {
//            case 18 :
//                System.out.println("you are an adult");
//                break;
//            case 23:
//                System.out.println("you are getting a job");
//                break;
//            case 60:
//                System.out.println("you are getting retired");
//                break;
//            default:
//                System.out.println("enjoy your life");

        Scanner a = new Scanner(System.in);
        System.out.println("enter your name");
        String name = a.next();
        switch(name)
        {
            case "suman":
                System.out.println("you are an admin");
                break;
            case "suji":
                System.out.println("you are helper");
                break;
            case "harsh":
                System.out.println("you are a tester");
                break;
            default:
                System.out.println("you are an user");






        }

    }
}

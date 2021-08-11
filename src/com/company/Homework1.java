package com.company;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        //division of 2 no given by user
        /*System.out.println("input by user");
        Scanner a = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int b = a.nextInt();
        System.out.println("Enter 2nd number");
        int c = a.nextInt();
        int div= b/c;
        System.out.println("division is "+div);*/

        //take name as user input and print hlo man have a good day
        /*Scanner a = new Scanner(System.in);
        String b = a.nextLine();
        System.out.println("enter your name");

        System.out.println("Hello "+b+ " Have a nice day!");*/
//        System.out.println("Have a nice day");

        //detect whether a no entered by user is int or not
        Scanner a = new Scanner(System.in);
        //boolean b = a.nextBoolean();
        System.out.println("enter a no");
        boolean c = a.hasNextInt();
        System.out.println("the no is "+c);






    }
}

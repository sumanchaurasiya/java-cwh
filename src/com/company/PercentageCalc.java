package com.company;
import java.util.Scanner;

public class PercentageCalc {
    public static void main(String[] args) {
        System.out.println("Taking user input");
        Scanner a =new Scanner(System.in);
        System.out.println("enter your 1st marks");
        int m = a.nextInt();
        System.out.println("enter your 2nd marks");
        int n = a.nextInt();
        System.out.println("enter your 3rd marks");
        int s = a.nextInt();
        System.out.println("enter your 4th marks");
        int u = a.nextInt();
        System.out.println("enter your 5th marks");
        int v = a.nextInt();
        int sum = m+n+s+u+v;
        float per = (sum/500.0f)*100;
        System.out.println("The percentage is : " +per);

    }
}
package com.company;
import java.util.Scanner;
public class Percentage {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter your Physics marks");
        int p = s.nextInt();

        System.out.println("Enter your Chemistry marks");
        int c = s.nextInt();

        System.out.println("Enter your Maths marks");
        int m = s.nextInt();

        System.out.println("Enter your Computer marks");
        int t = s.nextInt();

        System.out.println("Enter your Physical Education marks");
        int e = s.nextInt();

        float percentage = ((p+c+m+t+e)/500.0f) *100;
        System.out.println("percentage is " + percentage);
    }
}

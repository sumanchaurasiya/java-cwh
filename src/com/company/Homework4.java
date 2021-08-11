package com.company;
import java.util.Scanner;
import java.util.Random;

public class Homework4 {
    public static void main(String[] args) {
//        int a = 5;
//        if(a==6)
//        {
//            System.out.println("i am six");
//
//        }
//        else
//        {
//            System.out.println("i am not six");
//        }

//        Scanner a = new Scanner(System.in);
//        System.out.println("enter your physics marks");
//        byte m1 = a.nextByte();
//        System.out.println("enter your chemistry marks");
//        byte m2 = a.nextByte();
//        System.out.println("enter your maths marks");
//        byte m3 = a.nextByte();
//        float avg =  (m1+m2+m3)/3.0f;
//        System.out.println("your avg is " + avg);
//        if(avg >=40 && m1>=33 && m2>=33 && m3>=33)
//        {
//            System.out.println("you are passed");
//        }
//        else
//        {
//            System.out.println("you have failed");
//        }
//
//        float tax = 0.0f;
//        Scanner a = new Scanner(System.in);
//        System.out.println("enter your income");
//        float income = a.nextFloat();
//
//        if(income<=2.5f)
//        {
//            tax = tax+0;
//
//        }
//        else if(income>2.5f&&income<=5.0f)
//        {
//            tax = tax + 0.05f * (income-2.5f);
//        }
//        else if(income>5.0f&&income<=10.0f){
//            tax = tax + 0.05f* (5.0f-2.5f);
//            tax = tax+0.2f* (income-5.0f);
//        }
//        else if(income>10.0f)
//        {
//           tax = tax + 0.05f*(5.0f-2.5f);
//           tax = tax + 0.2f * (10.0f-5.0f);
//           tax = tax + 0.3f * (income-10.0f);
//        }
//        System.out.println(tax);


//        Scanner a = new Scanner(System.in);
//        System.out.println("enter your no");
//        int no = a.nextInt();
//        switch(no)
//        {
//            case 1 -> System.out.println("sunday");
//            case 2 -> System.out.println("monday");
//            case 3 -> System.out.println("tuesday");
//            case 4 -> System.out.println("wednesday");
//            case 5 -> System.out.println("thursday");
//            case 6 -> System.out.println("friday");
//            case 7 -> System.out.println("saturday");
//
//        }

//        Scanner a = new Scanner(System.in);
//        System.out.println("enter year");
//        int year = a.nextInt();
//        if((year%4==0)||(year%400==0)&&(year%100!=0))
//        {
//            System.out.println("leap year");
//
//        }
//        else
//        {
//            System.out.println("not leap year");
//        }

//        Scanner a = new Scanner(System.in);
//        System.out.println("enter your website name");
//        String name = a.nextLine();
//        if(name.endsWith(".org"))
//        {
//            System.out.println("this is an organisational website");
//        }
//        else if(name.endsWith(".com"))
//        {
//            System.out.println("this is  a commercial website");
//        }
//        else if(name.endsWith(".in"))
//        {
//            System.out.println("indian website");
//        }

        Random a = new Random();
        int no = a.nextInt();
        System.out.println(no);



    }

}

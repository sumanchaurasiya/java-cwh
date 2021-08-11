package com.company;
import  java.util.Scanner;
public class Loop {
    public static void main(String[] args) {
        //while loop
//        int a = 100;
//        while(a<=150)
//        {
//            System.out.println(a);
//            a++;
//        }

        //do while loop
//        int a = 20;
//        do{
//            System.out.println(a);
//            a++;
//        }
//        while(a<25);
//
//        int count = 1;
//        Scanner a = new Scanner(System.in);
//        System.out.println("enter your no");
//        int no = a.nextInt();
//        System.out.println("your numbers are");
//        do{
//            System.out.println(count);
//            count++;
//        }
//        while(count<=no);
//
//        int count


//        int count = 10;
//        Scanner a = new Scanner(System.in);
//        System.out.println("enter your no");
//        int no = a.nextInt();
//        System.out.println("your no are");
//        do{
//            System.out.println(count);
//            count--;
//        }
//        while(count>=no);
//        int count = 1;
//        Scanner a = new Scanner(System.in);
//        System.out.println("enter your no");
//        int no = a.nextInt();
//        System.out.println("your no are");
//        do{
//            System.out.println(count);
//            count= count + 2;
//
//        }
//        while(count<=no);
        System.out.println("numbers are");

//        for(int i=1;i<=10;i++)
//        {
//            System.out.printf("%d\t",i);
//        }

//        for(int i=1;i<=5;i++)
//        {
//            System.out.printf("%d\t",2*i);
//        }

//        for(int i=1;i<=10;i++)
//        {
//            System.out.printf("%d\t",2*i+1);
//        }
//        for(int i=1;i<=5;i++)
//        {
//            if(i==2)
//            {
//                System.out.println("ending the loop");
//                continue;
//            }
//            System.out.println(i);
//

//        int count = 0;

//        }

        int count = 0;
        System.out.println("numbers are");
        do {
            count++;
            if(count==2)
            {
                System.out.println("continue used here");
                continue;
            }
            System.out.println(count);

        }
        while(count<=5);


    }
}

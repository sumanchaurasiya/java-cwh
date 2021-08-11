package com.company;
import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        //sum of 1st n even no using while loop

//        int count=1;
//        int sum =0;
//
//        Scanner a= new Scanner(System.in);
//        System.out.println("enter your limit");
//        int no = a.nextInt();
//        while(count<=no)
//        {
//            if(count%2==0)
//            {
//                sum=sum+count;
//            }
//            count++;
//        }
//        System.out.println("sum is " + sum);

        //print multiplication no of any n no

//        int no = 10;
//        Scanner a = new Scanner(System.in);
//        System.out.println("enter no");
//        int num = a.nextInt();
//        for(int i = 1;i<=10;i++)
//        {
//            System.out.printf("%d * %d = %d \n",num,i,num*i);
//        }

        //print mul table of 10 in reverse order

//        System.out.println("table is");
//        for(int i=10;i>=1;i--)
//        {
//            System.out.printf("10\t*\t%d\t = \t%d\t \n",i,10*i);
//
//
//        }

        //fact of 5
//        int fact=1;
//        int i = 1;
//        int n = 8;
//        System.out.println("fact is");
//        while(i<=n)
//        {
//            fact= fact*i;
//            i++;
//        }
//        System.out.println(fact);
//


//        int fact =1;
//        int n=5;
//        System.out.println("fact is");
//        for(int i=1;i<=n;i++)
//        {
//            fact= fact*i;
//        }
//            System.out.println(fact);


        //sum of no occuring in table of 8

        int n =8;
        int sum =0;
        System.out.println("mul is");
        for(int i=1;i<=10;i++)
        {
            System.out.printf("%d\n",n*i);
            sum =n*i+sum;
        }
        System.out.println("sum is " + sum);

    }
}

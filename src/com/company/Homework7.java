package com.company;

public class Homework7 {
    static void multiply(int a){
        for(int i =1;i<=10;i++){
            System.out.printf("%d * %d = %d \n",a,i,a*i);
        }
    }

    static void pattern1(int b){
        for(int i = 0;i<b;i++){
            for(int j = 0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int sumRec(int d){
        if (d==1){
            return 1;
        }
        return d+sumRec(d-1);
    }

    static void pattern2(int d){
        for(int i=d;i>=0;i--)
        {
            for(int j = 0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static int fib(int e){
        if(e==1||e==2){
            return e-1;
        }
        else{
            return fib (e-1)+fib(e-2);
        }
    }

    static int avg(int ...arr){
        int sum = 0;
        for(int i:arr ){
            sum = sum+i;

        }
        return sum/arr.length;
    }
    static int temp (int n)
    {
        return ((n*9)/5)+32;
    }
    public static void main(String[] args) {


        //multiplication table of any no n using method
//        multiply(5);


        //right angle star pattern
//        pattern1(4);

        //recurrsive function to cal. sum of first n natural no
//        int c = sumRec(5);
//        System.out.println(c);

    //opposite of right angle pattern
//        pattern2(5);

        //nth term of fibonacci series using recursion

//        System.out.println(fib(22));

        //average of set of number passed as an arguments
//        System.out.println(avg(1,2,3,4,5));

        //convert cel. to faren.

        System.out.println(temp(45));

    }
}

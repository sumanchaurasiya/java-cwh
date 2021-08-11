package com.company;

public class Method2 {
//    static int sum(int a, int b){
//        return a+b;
//    }
//    static int sum(int a,int b,int c){
//        return a+b+c;
//    }
//    static int sum(int a,int b, int c,int d){
//        return a+b+c+d;
//    }

    static int sum(int a, int ...arr){
        //available as int [] arr;
        int r =a;
        for(int i: arr){
            r =r+i;
        }
        return r;
    }

    static int factorial(int v){
        if(v==0||v==1){
            return 1;
        }
        else{
            return v*factorial(v-1);
        }
    }

    static int factorial_iterative(int v){
        if(v==0||v==1) {
        return 1;
        }
        else{
            int temp = 1;
            for(int i =1;i<=v;i++)
            {
                temp =temp*i;
            }
            return temp;
        }
    }
    public static void main(String[] args) {
        //varargs = variable arguments
        //multiple arguments in a function
//
//        System.out.println(sum(6,9));
//        System.out.println(sum(6,9,6));
//        System.out.println(sum(6,9,6,9));
//        System.out.println(sum(4));

        int x =5;
        System.out.println(factorial(x));
        System.out.println(factorial_iterative(x));

    }
}

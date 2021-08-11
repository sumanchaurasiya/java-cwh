package com.company;
import java.util.Scanner;
public class Error {
    public static void main(String[] args) {
//        syntax error - when compiler finds something wrong with our program
//        logical error - a logical error or a bug error when ka prog compiles and runs but does the wrong thing
//        runtime error -  (exceptions) - when an error is occured  while the prog is running

//        SYNTAX ERROR
//        int a = 0     //ERROR: semicolon  is missing
//        b = 8;    //ERROR : data type is not declared

//        LOGICAL ERROR
//        prog to print prime no between 1 to 10
        for(int i = 1 ;i<5;i++){
            System.out.println(2*i+1);
        }

//        RUNTIME ERROR
        int s ;
        Scanner a = new Scanner(System.in);
        s = a.nextInt();
        System.out.println("integer part of thousand is " + 1000/s);


    }
}

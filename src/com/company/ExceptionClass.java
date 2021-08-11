package com.company;
import java.util.Scanner;
class MyException extends Exception{
    @Override
    public String toString(){
        return  "i am to string";
    }
    @Override
    public String getMessage(){
        return  "i am get message";
    }
}

public class ExceptionClass {
    public static void main(String[] args) {

        int a ;
        Scanner s =new Scanner(System.in);
        a = s.nextInt();
        if(a<9) {
            try {
//                throw new MyException();
                throw new ArithmeticException("this is exception");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
//                System.out.println(e);
            }
        }
    }
}

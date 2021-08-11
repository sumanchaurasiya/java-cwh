package com.company;
import java.util.Scanner;
class MaxRetryException extends Exception{
    @Override
    public String toString(){
        return "max retries reached";
    }
    @Override
    public String getMessage(){
        return "max retries reached";
    }
}
public class Homework13 {
    public static void main(String[] args) {
//        wap that prints haa haa during arithmetic exception and hii hii during illegal argument exception
        try{
            int o = 5;
            int f = 0;
//            int g = o/f;
            throw new IllegalArgumentException();

//            System.out.println(g);
        }
        catch(ArithmeticException e){
            System.out.println("HAA HAA");
        }
        catch(IllegalArgumentException e){
            System.out.println("HII HII");

        }

//        wap that allows you to keep accessing an array until a valid index is given if max retry exceeds 5  print error

        int [] arr = new int[3];
        arr[0] = 2;
        arr[1] = 4;
        arr[2] = 7;
        Scanner s = new Scanner(System.in);
        boolean flag = true;
        int i=0;
        while(i<5 && flag){
            try{
                System.out.println("Enter the value of index : ");
                int index = s.nextInt();
                System.out.println("THE VALUE OF THAT INDEX IS " + arr[index]);
                break;
            }
            catch(Exception e){
                System.out.println("invalid index");
                i++;
            }
            
        }
        if(i>=5){
            try{
                throw new MaxRetryException();
            }
            catch(Exception e){
                System.out.println(e);
            }
            finally {
                System.out.println("Error");

            }
        }

//        throw a custom exception when max retries a reach


    }
}

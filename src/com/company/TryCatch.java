package com.company;
import java.util.Scanner;
public class TryCatch {
    public static void main(String[] args) {
//        int a = 5;
//        int b = 0;
//        int c = a/b;
//        System.out.println(c);
////
//        try{
//            int c = a/b;
//            System.out.println(c);
//        }
//        catch(Exception e){
//            System.out.println("Reason");
//            System.out.println(e);
//        }
        try {
            int a = 36 / 0;
        } catch (IllegalArgumentException e) {
            System.out.println("test a");
        } catch (ArithmeticException e) {
            System.out.println("test b");
        }


        boolean b = true;
        int[] arr = new int[5];
        arr[0] = 36;
        arr[1] = 45;
        arr[2] = 23;
        arr[3] = 12;
        arr[4] = 36;
        Scanner s = new Scanner(System.in);
        System.out.println("enter array index : ");
//        int q = s.nextInt();
        System.out.println("enter no u want to divide : ");
//        int r = s.nextInt();
//        try {
//            System.out.println(arr[q]);
//            System.out.println(arr[q] / r);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("array error occured");
//            System.out.println(e);
//        } catch (ArithmeticException e) {
//            System.out.println("arithmetic error");
//            System.out.println(e);
//        } catch (Exception e) {
//            System.out.println("some other error");
//            System.out.println(e);
//        }

        int t = s.nextInt();
        try{
            System.out.println("first try");
            try{
                System.out.println(arr[t]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("array exception");
                System.out.println(e);
            }
        }

        catch(Exception e){
            System.out.println(e);
        }

    }
}

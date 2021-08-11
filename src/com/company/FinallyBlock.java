package com.company;

public class FinallyBlock {
    public static int greet(){
        try{
            int a = 50;
            int b = 10;
            int c = a/b;
            return c;
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("This is end of program");
        }
        return -1;
    }
    public static void main(String[] args) {

       int k = greet();
        System.out.println(k);
        int d = 4;
        int f = 5;
        while(true){
            try{
                System.out.println(d/f);
            }
            catch(Exception e ){
                System.out.println(e);
                break;
            }
            finally{
                System.out.println("d = " + f);
            }
            f--;
        }

        try{
            System.out.println(50/3);
        }
        finally{
            System.out.println("this is finally");
        }
    }
}

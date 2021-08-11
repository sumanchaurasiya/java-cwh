package com.company;
class NegativeRadiusException extends Exception{
    @Override
    public String toString(){
        return "radius cannot be negative";
    }
    @Override
    public String getMessage(){
        return "radius cannot be negative";

    }
}

public class ThrowvsThrows {
    public static int divide(int a,int b) throws ArithmeticException{
        int r2 = a/b;
        return r2;
    }
    public static double area(int r) throws NegativeRadiusException{
        if(r<0){
            throw new NegativeRadiusException();
        }
        double ra= Math.PI*r*r;
        return ra;
    }

    public static void main(String[] args) {
        try{
//            int c = divide(6,0);
//            System.out.println(c);
            double ar = area(-6);
            System.out.println(ar);
        }
        catch(Exception e){
            System.out.println("Exception");

        }


    }
}

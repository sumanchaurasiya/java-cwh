package com.company;
class InvalidInputException extends Exception{
    @Override
    public String toString(){
        return "cannot add 8 & 9";
    }
    @Override
    public String getMessage(){
        return "i am getmessage";
    }

}
class MaxInputException extends Exception{
    @Override
    public String toString(){
        return "input cannot be greater than 100000 ";
    }
    @Override
    public String getMessage(){
        return "i am get message";
    }
}
class DivideByZeroException extends Exception{
    @Override
    public String toString(){
        return "cannot divide by zero ";
    }
    @Override
    public String getMessage(){
        return "i am get message";
    }
}
class MaxMultiplierException extends Exception{
    @Override
    public String toString(){
        return "input cannot be greater than 7000 ";
    }
    @Override
    public String getMessage(){
        return "i am get message";
    }
}

class CustomCalculator1{
    double add(double a,double b) throws InvalidInputException, MaxInputException{
        if(a>100000 ||b>100000){
            throw new MaxInputException();
        }
        if(a==8 ||b==9){
            throw new InvalidInputException();
        }
        return a+b;
    }
    double sub(double a,double b) throws MaxInputException{
        if(a>100000 ||b>100000) {
            throw new MaxInputException();
        }
        return a-b;
    }
    double mul(double a,double b) throws MaxMultiplierException ,MaxInputException{
        if(a>100000 ||b>100000) {
            throw new MaxInputException();
        }
        if(a>7000 ||b>7000){
            throw new MaxMultiplierException();
        }
        return a*b;

    }
    double div(double a, double b) throws DivideByZeroException ,MaxInputException{
        if(a>100000 ||b>100000) {
            throw new MaxInputException();
        }
        if(b==0){
            throw new DivideByZeroException();
        }
        return a/b;
    }

}
public class CustomCalculator {
    public static void main(String[] args) throws InvalidInputException, MaxInputException, DivideByZeroException, MaxMultiplierException{
        /*
        Exercise 6: You have to create a custom calculator with following operations:
        1. + -> Addition
        2. - -> Subtraction
        3. * -> Multiplication
        4. / -> Division
        which throws the following exceptions:
        1. Invalid input Exception ex: 8 & 9 for addition
        2. Cannot divide by 0 Exception
        3. Max Input Exception if any of the inputs is greater than 100000
        4. Max Multiplier Reached Exception - Don't allow any multiplication input to be greater than 7000
         */
        CustomCalculator1 c = new CustomCalculator1();
//        c.add(8,9);

        try{
//
//            c.add(8,9);
            double d = c.add(5,3.5);
            int i = (int)Math.round(d);

            System.out.println("double value " + d);
            System.out.println("int value " + i);

        }

        catch(Exception e){
            System.out.println(e);
//            e.printStackTrace();
        }
        finally
        {
            System.out.println("Program Ended");
        }
    }
}


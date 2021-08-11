package com.company;
@FunctionalInterface
interface functionalInterface{
    void method();
//    void method1();
}

class NewPhone extends Phone{
    @Override
    public void showTime(){
        System.out.println("time is 10 A.M");
    }
    @Deprecated
    public int sum (int x,int y){
        return x+y;
    }
}
public class Annotations {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        NewPhone phone = new NewPhone();
        phone.showTime();

        phone.sum(2,4);
    }
}

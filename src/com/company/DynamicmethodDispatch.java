package com.company;
class Phone{

    public void showTime(){
        System.out.println("time is 12 A.M");
    }
    public void on(){
        System.out.println("turning on phone");
    }
}

class SmartPhone extends Phone{
    public void music(){
        System.out.println("playing music");
    }
    public void on(){
        System.out.println("turning on smartphone");
    }
}
public class DynamicmethodDispatch {
    public static void main(String[] args) {

//        Phone p = new Phone();
//        SmartPhone s = new SmartPhone();

        Phone p = new SmartPhone();
        p.showTime();
//        (dynamic method dispatch)
//        SmartPhone s = new Phone();
//        not allowed

    }
}

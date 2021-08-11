package com.company;

@FunctionalInterface
interface DemoAno{
    void meth1(int a);
//    void meth2();
}

//class MyFun implements DemoAno{
//    @Override
//    public void meth1(){
//        System.out.println("i am meth1");
//    }
//}

//abstract class Vehicle{
//    abstract void drive();
//}
//class AnonyDemo implements DemoAno{
//    public void display(){
//        System.out.println("Hello");
//    }
//
//    @Override
//    public void meth1() {
//        System.out.println("i am meth 1");
//    }
//
//    @Override
//    public void meth2() {
//        System.out.println("i am meth 2");
//    }
//}
public class Lambda {

    public static void main(String[] args) {
//        AnonyDemo an = new AnonyDemo();
//        an.meth1();

//        DemoAno obj = new DemoAno() {
//            @Override
//            public void meth1() {
//                System.out.println("i am meth1");
//            }

//            @Override
//            public void meth2() {
//                System.out.println("i am meth 2");
//            }
//        };
//        obj.meth1();

//        Vehicle car = new Vehicle() {
//            @Override
//            void drive() {
//                System.out.println("I am driving a car");
//            }
//        };
//        car.drive();

        //lambda expression : (parameter) -> {code to be executed}
//        DemoAno obj1 = new MyFun();
//        obj1.meth1();

        DemoAno obj2 = (a) -> {
            System.out.println("i am " + a);
        };

        obj2.meth1(6);
    }
}

package com.company;
abstract class Parent2{
    public Parent2(){
        System.out.println("i am base 2 constructor");
    }
    public void sayhello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}

class Child2 extends Parent2{
    @Override
    public void greet(){
        System.out.println("good morning");
    }
    @Override
    public void greet2(){
        System.out.println("good evening");
    }
}
abstract class Child3 extends Parent2{
    public void th(){
        System.out.println("i am good");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
//        Parent2 p = new Parent2();
        Child2 r = new Child2();
        r.greet();


    }
}

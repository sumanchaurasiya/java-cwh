package com.company;

class Base1{
    Base1(){
        System.out.println("i am constructor");
    }
    Base1(int r){
        System.out.println("i am overloaded cons. with : " + r);
    }
}

class Derived1 extends Base1{
    Derived1(){
//        super(0);
        System.out.println("i am derived1 contructor");
    }
    Derived1(int e,int f){
        super(e);
        System.out.println("i am an overloaded cont. with : " + f);
    }
}

class ChildDerived extends Derived1{
    ChildDerived(){
        System.out.println("i am child of derived cont.");
    }

    ChildDerived(int h,int g,int k){
        super( h,g);
        System.out.println("i am overloaded cont. of  derived eith value :  " + k);
    }
}

public class InheritanceConstructor {
    public static void main(String[] args) {

//        Base1 u = new Base1();
//        Derived1 q = new Derived1();
//        Derived1 y = new Derived1(2,8);
//        ChildDerived l = new ChildDerived();
        ChildDerived o = new ChildDerived(4,7,5);

    }
}

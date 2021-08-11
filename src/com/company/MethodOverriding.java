package com.company;
 class A {
     public int a;
     public int test (){
         return 4;
     }
     public void test2(){
         System.out.println("i am method 2 of cls a");
     }
 }

 class B extends A{
     @Override
     public void test2(){
         System.out.println(" i am method 2 of cls b");
     }
     public void test3(){
         System.out.println("i am method 3 of cls b");
     }

 }
public class MethodOverriding {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.test2();
        b.test2();
    }
}

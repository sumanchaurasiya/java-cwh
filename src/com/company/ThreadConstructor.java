package com.company;
class MyThread3 extends Thread{
   public MyThread3(String name){
       super(name);
   }
   public void run(){
       System.out.println("THANK YOU");
   }
}
public class ThreadConstructor {
    public static void main(String[] args) {
        MyThread3 t1 = new MyThread3("samay");
        t1.start();
        System.out.println("the name is " + t1.getName());
        System.out.println("the id is " + t1.getId());
        MyThread3 t2 = new MyThread3("suman");
        System.out.println("the name is " + t2.getName());
        System.out.println("the id is " +t2.getId());

    }
}

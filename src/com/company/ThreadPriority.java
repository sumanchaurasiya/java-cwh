package com.company;

class MyThread4 extends Thread{
    public MyThread4(String name){
        super(name);
    }
    public void run(){
        while(true){
            System.out.println(this.getName());
        }
//        System.out.println("THANK YOU");
    }
}
public class ThreadPriority {
    public static void main(String[] args) {
//        ready queue: T1 T2 T3 T4 T5 TO
        MyThread4 T1 = new MyThread4("suman");
        MyThread4 T2 = new MyThread4("suman1");
        MyThread4 T3 = new MyThread4("suman2");
        MyThread4 T4 = new MyThread4("suman3");
        MyThread4 T5 = new MyThread4("suman4");



//        T5.setPriority(Thread.MAX_PRIORITY);
        T1.setPriority(Thread.MIN_PRIORITY);
        T2.setPriority(Thread.MIN_PRIORITY);
        T3.setPriority(Thread.MIN_PRIORITY);
        T4.setPriority(Thread.MIN_PRIORITY);
        T5.setPriority(Thread.MIN_PRIORITY);


            System.out.println(T5.isAlive());
//        T1.start();
//        T2.start();
//        T3.start();
//        T4.start();
//        T5.start();




//        System.out.println(T1.getName());
//        System.out.println(T2.getName());
//        System.out.println(T3.getName());
//        System.out.println(T4.getName());
//        System.out.println(T5.getName());



    }
}

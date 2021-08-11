package com.company;

class MyThreadRunnable1 implements Runnable{
    public void  run(){
        System.out.println("i am runnable 1");
        System.out.println("i am runnable 1");
        System.out.println("i am runnable 1");
        System.out.println("i am runnable 1");
        System.out.println("i am runnable 1");
        System.out.println("i am runnable 1");
        System.out.println("i am runnable 1");
        System.out.println("i am runnable 1");
        System.out.println("i am runnable 1");
        System.out.println("i am runnable 1");
        System.out.println("i am runnable 1");
        System.out.println("i am runnable 1");
        System.out.println("i am runnable 1");
        System.out.println("i am runnable 1");
        System.out.println("i am runnable 1");
        System.out.println("i am runnable 1");
        System.out.println("i am runnable 1");
        System.out.println("i am runnable 1");
        System.out.println("i am runnable 1");
        System.out.println("i am runnable 1");
        System.out.println("i am runnable 1");
        System.out.println("i am runnable 1");
        System.out.println("i am runnable 1");
        System.out.println("i am runnable 1");
        System.out.println("i am runnable 1");
        System.out.println("i am runnable 1");
        System.out.println("i am runnable 1");
        System.out.println("i am runnable 1");
        System.out.println("i am runnable 1");
        System.out.println("i am runnable 1");
        System.out.println("i am runnable 1");
        System.out.println("i am runnable 1");
        System.out.println("i am runnable 1");
        System.out.println("i am runnable 1");
        System.out.println("i am runnable 1");
        System.out.println("i am runnable 1");
        System.out.println("i am runnable 1");
        System.out.println("i am runnable 1");
        System.out.println("i am runnable 1");
        System.out.println("i am runnable 1");
        System.out.println("i am runnable 1");
        System.out.println("i am runnable 1");
        System.out.println("i am runnable 1");
        System.out.println("i am runnable 1");
        System.out.println("i am runnable 1");
        System.out.println("i am runnable 1");
        System.out.println("i am runnable 1");
        System.out.println("i am runnable 1");
        System.out.println("i am runnable 1");
        System.out.println("i am runnable 1");
    }
}

class MyThreadRunnable2 implements Runnable{
    public void  run(){
        System.out.println("i am runnable 2");
        System.out.println("i am runnable 2");
        System.out.println("i am runnable 2");
        System.out.println("i am runnable 2");
        System.out.println("i am runnable 2");
        System.out.println("i am runnable 2");
        System.out.println("i am runnable 2");
        System.out.println("i am runnable 2");
        System.out.println("i am runnable 2");
        System.out.println("i am runnable 2");
        System.out.println("i am runnable 2");
        System.out.println("i am runnable 2");
        System.out.println("i am runnable 2");
        System.out.println("i am runnable 2");
        System.out.println("i am runnable 2");
        System.out.println("i am runnable 2");
        System.out.println("i am runnable 2");
        System.out.println("i am runnable 2");
        System.out.println("i am runnable 2");
        System.out.println("i am runnable 2");
        System.out.println("i am runnable 2");
        System.out.println("i am runnable 2");
        System.out.println("i am runnable 2");
        System.out.println("i am runnable 2");
        System.out.println("i am runnable 2");
        System.out.println("i am runnable 2");
        System.out.println("i am runnable 2");
        System.out.println("i am runnable 2");
        System.out.println("i am runnable 2");
        System.out.println("i am runnable 2");
        System.out.println("i am runnable 2");
        System.out.println("i am runnable 2");
        System.out.println("i am runnable 2");
        System.out.println("i am runnable 2");
        System.out.println("i am runnable 2");
    }
}

public class JavaThread2 {
    public static void main(String[] args) {
        MyThreadRunnable1  bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);
        gun1.start();
        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);
        gun2.start();

    }
}

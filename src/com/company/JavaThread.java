package com.company;
class MyThread extends Thread{
    @Override
    public void run(){
        int a = 0;
        while(a<40000){
            System.out.println("i am coding");
            System.out.println("i am cooking");
            a++;
        }
    }

}
class MyThread2 extends Thread {
    @Override
    public void run() {
        int a = 0;
        while (a < 40000) {
            System.out.println("i am chating");
            System.out.println("i am typing");
            a++;
        }
    }

}
//dono kaam ho rha h pr ek time me ek hi hoga n = concurrency ,eg multithreading
public class JavaThread {
    public static void main(String[] args) {
        MyThread m = new MyThread();
        MyThread2  n = new MyThread2();
        m.start();
        n.start();
    }
}

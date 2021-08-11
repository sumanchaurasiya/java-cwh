package com.company;

class MyThread7 extends Thread{
    public void run(){
        while(true) {
//            try{
//                Thread.sleep(200);
//            }
//            catch(Exception e){
//                System.out.println(e);
//            }
            System.out.println("GOOD MORNING");
        }
    }
}
class MyThread8 extends Thread{
    public void run(){
        while(true){
//            try{
//                Thread.sleep(200);
//            }
//            catch(Exception e){
//                System.out.println(e);
//            }
            System.out.println("WELCOME");
        }
    }
}
public class Homework12 {
    public static void main(String[] args) {
        //        wap to print welcome and good morning continuously on screen using threads

        MyThread7 t7 = new MyThread7();
        MyThread8 t8 = new MyThread8();
//        t7.start();
//        t8.start();


//        add a sleep method in welcome thread to a delay of 200ms

//        demonstrate getpriority and setpriority methods

        t7.setPriority(Thread.MIN_PRIORITY);
        t8.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t7.getPriority());
        System.out.println(t8.getPriority());
//        t7.start();
//        t8.start();

//        HOW DO YOU GET STATE OG A GIVEN THREAD AND REFERENCE TO CURRENT THREAD IN JAVA
        System.out.println(t8.getState());
        System.out.println(Thread.currentThread().getState());

    }
}

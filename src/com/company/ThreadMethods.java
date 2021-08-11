package com.company;
class MyThread1 extends Thread{
    public void run(){
        int i = 0;
        while(true){
            System.out.println("thank you ");
            try{
                Thread.sleep(455);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            i++;
        }
    }
}
class MyThread5 extends Thread{
    public void run(){
        while(true){
            System.out.println("welcome ");
        }
    }
}
public class ThreadMethods {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread5 t2 = new MyThread5();
        t1.start();
//        try {
//            t1.join(10000);
//        } catch (Exception e) {
//            System.out.println(e);
//        }
        t2.start();
    }

}

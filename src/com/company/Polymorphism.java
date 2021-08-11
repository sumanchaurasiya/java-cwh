package com.company;
interface MyCamera2 {
    void takeSnap();

    void recordVideo();

    private void greet() {
        System.out.println("Good Morning");
    }

    default void record4kVideo() {
        greet();
        //give new functionality to exisring interface

        System.out.println("Recording in 4K");
    }
}

interface MyWifi2{
    String[] getNetworks();
    void connectNetwork(String network);
}

class MyCellphone2{
    void callNumber(int phoneNumber) {
        System.out.println("calling " + phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting");
    }
}

class MySmartphone2 extends MyCellphone2 implements MyCamera2, MyWifi2{
    public void takeSnap(){
        System.out.println("taking snap");
    }
    public void recordVideo(){
        System.out.println("recording video");
    }
    //    public void record4kVideo(){
//        System.out.println("recording 4k video");
//    }
    public String[] getNetworks(){
        System.out.println("getting list of network");
        String[] networkList = {"redmi","realme","infinix"};
        return networkList;
    }
    public void connectNetwork(String network){
        System.out.println("connecting to " + network);
    }

}

public class Polymorphism {
    public static void main(String[] args) {
        MyCamera2 m = new MySmartphone2(); //this is smartphone but uses as camera
        m.record4kVideo();
//        m.getNetworks(); not allowed

        MySmartphone2 s = new MySmartphone2();
        s.getNetworks();

    }
}

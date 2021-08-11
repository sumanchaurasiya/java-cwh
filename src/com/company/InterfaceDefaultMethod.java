package com.company;

interface MyCamera {
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

interface MyWifi{
    String[] getNetworks();
    void connectNetwork(String network);
}

class MyCellphone{
    void callNumber(int phoneNumber) {
        System.out.println("calling " + phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting");
    }
}

class MySmartphone extends MyCellphone implements MyCamera, MyWifi{
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

public class InterfaceDefaultMethod {
    public static void main(String[] args) {
        MySmartphone m = new MySmartphone();
        m.record4kVideo();
//        m.greet();}
        String[] arr = m.getNetworks();
        for (String s : arr) {
            System.out.println(s);

        }

    }
}
package com.company;
interface Bicycle{
    int a = 5;
    void applybreak(int decrement);
    void speedup(int increment);
}

interface HornBicycle{
    int x = 3;
    void blowhorn1();
    void blowhorn2();
}

class HeroCycle implements Bicycle, HornBicycle{
    void blowhorn(){
        System.out.println("horn a");
    }
    public void applybreak(int decrement){
        System.out.println("applying break");
    }
    public void speedup(int increment){
        System.out.println("increasing speed");
    }
    public void blowhorn1(){
        System.out.println("horn b");
    }
    public void blowhorn2(){
        System.out.println("horn c");
    }

}

public class Interfaces {
    public static void main(String[] args) {
        HeroCycle h = new HeroCycle();
        h.applybreak(6);
        System.out.println(h.a);

        
    }
}

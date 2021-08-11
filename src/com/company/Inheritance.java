package com.company;
class Base{
    public int x;

    public int getX(){
        return x;
    }

    public void setX(int x){
        System.out.println("i am in base and setting x");
        this.x = x;
    }

    public void print(){
        System.out.println("i am a constructor");
    }

}

class Derived extends Base{
    public int y;
    public  int getY(){
        return y;
    }

    public void setY(int y){
        this.y = y;
    }

}

public class Inheritance {
    public static void main(String[] args) {

        Base c = new Base();
        c.setX(36);
        System.out.println(c.getX());
//        c.print();

        Derived  d = new Derived();
        d.setY(20);
        System.out.println(d.getY());



    }
}
//make class animal and derive class dog

// public class Dog extends Animal{

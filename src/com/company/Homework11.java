package com.company;
abstract class Pen{
    abstract public void write();
    abstract public void refill();
}
class FountainPen extends Pen{
    public void changeNib(){
        System.out.println("change nib");
    }
    public void write(){
        System.out.println("write");
    }
    public void refill(){
        System.out.println("refill");
    }
}

class Monkey{
    public void jump(){
        System.out.println("jump");
    }
    public void bite(){
        System.out.println("bite");
    }

}
interface BasicAnimal{
    void eat();
    void sleep();
}

class Human extends Monkey implements BasicAnimal{
    public void speak(){
        System.out.println("speak");
    }
    @Override
    public void eat(){
        System.out.println("eat");
    }
    @Override
    public void sleep(){
        System.out.println("sleep");
    }
}

interface TvRemote{
    void button();
}

interface SmarttvRemote extends TvRemote{
    void button2();
}

class TV implements SmarttvRemote {
    public void button(){
        System.out.println("press on button");
    }
    public void button2(){
        System.out.println("press off button");
    }
}

abstract class Telephone{
    abstract public void ring();
    abstract public void lift();
    abstract public void disconnect();

}

class SmartTelephone extends Telephone {
    @Override
    public void ring(){
        System.out.println("Ringing");
    }
    @Override
    public void lift(){
        System.out.println("Lift");
    }
    @Override
    public void disconnect(){
        System.out.println("Disconnect");
    }
}

public class Homework11 {
    public static void main(String[] args) {
        // create abstract class pen with abstract method write and refill
        //create concrete class fountain pen of class pen with additional method change nib
        FountainPen p = new FountainPen();
//        p.write();

        //create a class monkey with jump and bite method .create another class human which inherit this monkey class and
        //implements basic animal interface with eat and sleep methods.


//        Human h = new Human();
//        h.eat();
//        h.jump();
//        Monkey m = new Human();
//        m.sleep() ;

        //create an interface tv remote and use it to inherit another  interface smart tv remote
        //create a class tv which implements tv remote interface
        TV t = new TV();
//        t.button2();

        //create a class telephone with methods ring, lift ,disconnect as abstract.
//        create another class SmartTelephone and demonstrate polymorphism
            Telephone e = new SmartTelephone();
            e.disconnect();
            
    }
}

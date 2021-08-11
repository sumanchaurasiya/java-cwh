package com.company;

class Demo{
    int a;
    public int getA(){
        return a;
    }
    Demo (int a){
        this.a = a;
    }
    public int  ret(){
        return 1;
    }

}

class Demo2 extends Demo{
    Demo2 (int e){
        super (e);
        System.out.println("i am a cont.");
    }
}
public class ThisSuper {
    public static void main(String[] args) {
        Demo g = new Demo(4);
        Demo2 f = new Demo2(1);
        System.out.println(g.getA());

    }
}

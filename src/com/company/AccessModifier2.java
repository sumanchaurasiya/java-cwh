package com.company;
class C1{
    public int x = 6;
    protected int y = 9;
    int z = 5;
    private int p =8;
    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(p);
    }
}
public class AccessModifier2 {
    public static void main(String[] args) {
        C1 c = new C1();
//        c.meth1();
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
//        System.out.println(c.p);
//        default,private



    }
}

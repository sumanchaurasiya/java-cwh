package com.company;

public class JavaDoc {
    static void greet(){
        System.out.println("good morning dear");
    }
    static void greet(String j){
        System.out.println("good morning " + j + " dear");
    }
    static void change(int i) {
        i = 98;
    }

    static int logic(int x, int y) {
        int z;
        z = x + y;
        return z;
    }

    static void change1(int[] arr) {
        arr[2] = 69;
    }

    public static void main(String[] args) {
        //        int a = 3;
//        int b = 6;
//        int sum;
        //method invocation
        //Method obj = new Method();
        //sum = obj.logic(a,b);
//        sum = logic(a, b);
//        System.out.println(sum);


//        int[] i = {3, 5, 2, 7, 8};
//        int s = 6;
//        change(s);
//        change1(i);
////        System.out.println(s);
//        System.out.println(i[2]);
//

        //method overloading
        //two or more methods having same name but different parameters are called method overloading.


        greet();
        greet("suman");
        



    }

}

package com.company;
class User{
    int salary;
    String name;

    public int getSalary(){
        return salary;

    }

    public String getName(){
        return name;
    }

    public void setName(String c){
        name=c;
        System.out.println(name);
    }

}
class CellPhn{
    public void ring(){
        System.out.println("Ringing...");
    }

    public void vib(){
        System.out.println("Vibrating...");
    }
}
class Square{
    int side;

    public  void area(){
        System.out.println(side*side);
    }

    public void perimeter(){
        System.out.println(4*side);
    }

}
class Rect{
    int length;
    int breath;

    public void area(){

        System.out.println(length*breath);

    }
    public void perim(){
        System.out.println(2*(length+breath));

    }
}
class Circle{
    int radius;

    public void area(){
        System.out.println(3.14*radius*radius);
    }
    public void perim(){
        System.out.println(2*3.14*radius);
    }
}


public class Homework8 {
    public static void main(String[] args) {
        //create a class user with foll. pro.&method
        //salary,get salary,name,get name,set name

        User s = new User();
        s.name = "ram";
        s.salary = 20000;
//        System.out.println(s.getName());
//        System.out.println(s.getSalary());
//        s.setName("sona");


        // create a class cellphn with methods to print ringing vibrating

        CellPhn c = new CellPhn();
//        c.ring();
//        c.vib();


        //create a class square with methods area and perimeter and attribute side

        Square h = new Square();
        h.side = 5;
//        h.area();
//        h.perimeter();


        Rect r = new Rect();
        r.length = 7;
        r.breath = 8;
//        r.area();
//        r.perim();

        Circle f = new Circle();
        f.radius= 9;
        f.area();
        f.perim();

    }
}


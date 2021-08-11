package com.company;
class Cylinder{
     private int radius;
     private int height;

     public Cylinder(int  r,int h){
         this.radius = r;
         this.height = h;
     }

    public int getRadius(){
        return radius;

    }
    public int getHeight(){
        return height;
    }
    public void setRadius(int r){
        this.radius = r;

    }
    public void setHeight(int h)
    {
        this.height = h;
    }

    public double volume(){
        return Math.PI*radius*radius *height;
    }
    public double surfaceArea(){
        return 2*Math.PI*radius*radius + 2*Math.PI*height*radius;
    }

}


class Rectangle{
    private int length;
    private int breadth;

    public Rectangle(){
        this.length = 4;
        this.breadth = 5;
    }

    public Rectangle(int l,int b){
        this.length = l;
        this.breadth= b;
    }

    public int getLength(){
        return length;
    }

    public int getBreath(){
        return breadth ;
    }
}


class Sphere{
    private  int radius;

    public Sphere(int r){
        this.radius = r;
    }

    public int getRadius(){
        return radius;
    }
    public double volume(){
        return 1.3*Math.PI*radius*radius*radius;
    }

    public double surfaceArea(){
        return 4*Math.PI*radius*radius;
    }
}

public class Homework9 {
    public static void main(String[] args) {

        //create a class cylinder and use getter and setter to set its radius and height
        //find surface area and vol
        Cylinder c = new Cylinder(6,9);
//        c.setRadius(6);
//        c.setHeight(3);
//        System.out.println(c.volume());
//        System.out.println(c.surfaceArea());

        //overload a constructor used to initialise a rectangle of length 4 and breath 5 for using custom parameter

        Rectangle r = new Rectangle(6,9);
        System.out.println(r.getBreath());
        System.out.println(r.getLength());


        //repeat q1 for sphere

        Sphere s = new Sphere(9);
        System.out.println(s.getRadius());
        System.out.println(s.volume());
        System.out.println(s.surfaceArea());
    }
}

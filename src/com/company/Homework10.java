package com.company;
class Circle1{
     public float radius;
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
    Circle1(float r){
        this.radius = r;
    }
}
class Cylinder1 extends Circle1{
   public float height;
   Cylinder1(float r,float h){
       super (r);
       this.height= h;

   }

   public double volume()
   {
       return Math.PI * this.radius* this.radius*this.height;
   }
}


class Rect1{
    public int length;
    public int breadth;
    Rect1(int l,int b){
        this.length = l;
        this.breadth = b;
    }
    public int area(){
        return this.length * this.breadth;
    }


}
class Cuboid1 extends Rect1{
    public int height;
    Cuboid1(int l,int b,int h){
            super (l,b);
            this.height = h;
        }
        public int volume(){
        return this.length*this.breadth*this.height;
        }

}
public class Homework10 {
    public static void main(String[] args) {

        //create a class circle and use inheritance to create another class cylinder from it
        //create method for area and vol.
        Cylinder1 c = new Cylinder1(12.0f,4.5f);
        System.out.println("vol is " + c.volume());
        System.out.println("area is " + c.area());

        //create a cls rect and inherit another class cuboid find area and vol
        Cuboid1 h = new Cuboid1(2,5,3);
        System.out.println("area of rect is " + h.area());
        System.out.println("volume of cuboid is " + h.volume());
    }
}

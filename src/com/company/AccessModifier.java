package com.company;

class Student{
     private int id;
     private String name;

     public void setName(String n){
          this.name = n;
     }
     public void setId(int i){
         this.id = i;
     }
     public String getName(){
         return name;
     }
     public int getId(){
         return id;
     }
}

public class AccessModifier {
    public static void main(String[] args) {
        Student s = new Student();
//        s.id = 345;
//        s.name = "abc";
//        System.out.println(s.name);
        s.setName("suman");
        s.setId(50);
        System.out.println(s.getId());
        System.out.println(s.getName());



    }
}

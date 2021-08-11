package com.company;

class Employee{
    int id;
    String name;
    float salary;
    public void details(){
        System.out.println(name);
        System.out.println(id);
    }
    public float sal(){
        return salary;
    }
}

public class Custom_class {
    public static void main(String[] args) {
        System.out.println("this is custom class");

        //instantiating a new object
        Employee suman = new Employee();
        Employee suji = new Employee();

        //setting attribute for suman
        suman.id = 26;
        suman.name = "suman";


        //setting attributes foe suji
        suji.id = 30;
        suji.name = "sujata";
        suji.salary = 4500.7f;

        //printing the attributes
//        System.out.println(suman.name);
//        System.out.println(suman.id);
        suman.details();
        suji.details();
        System.out.println(suji.sal());


    }
}

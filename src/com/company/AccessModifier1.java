package com.company;
class MyStudent{
    private int id;
    private String name;

    public MyStudent(){
        id = 0;
        name = "abc";

    }

    public MyStudent(String myName, int myId){
        id = myId;
        name = myName;
    }

    public MyStudent(String myName){
        id = 1;
        name = myName;
    }

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

public class AccessModifier1 {
    public static void main(String[] args) {
        MyStudent m = new MyStudent("suman",11);
        System.out.println(m.getId());
        System.out.println(m.getName());

    }
}

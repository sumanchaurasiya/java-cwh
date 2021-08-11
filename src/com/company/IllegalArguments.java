package com.company;

public class IllegalArguments {
    int m ;
    public void setMarks(int marks){
        if(marks<0 || marks>100){
            throw new IllegalArgumentException(Integer.toString(marks));
        }
        else{
            m = marks;
        }
    }
    public static void main(String[] args) {
        IllegalArguments i = new IllegalArguments();
        i.setMarks(102);
        System.out.println(i.m);
    }
}

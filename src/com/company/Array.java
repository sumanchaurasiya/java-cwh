package com.company;

import java.util.Locale;

public class Array {
    public static void main(String[] args) {
        //declaration and memory allocation
//        int [] marks = new int[5];

        //declaration and than memory allocation
//        int [] marks;
//        marks = new int[5];

        //initialisation
//        marks[0] = 100;
//        marks[1] = 50;
//        marks[2] = 58;
//        marks[3] = 70;
//        marks[4] = 80;


        //decleration ,memory allocation and initialisation together

//        int [] marks = {100,50,58,70,80};
        //displaying an array(naive way)
//        System.out.println(marks[3]);
//        System.out.println(marks.length);

        //displaying using for loop
//        for(int i=0;i<marks.length;i++)
//        {
//            System.out.println(marks[i]);
//        }


        //displaying array in reverse order

//        for(int i=marks.length-1;i>=0;i--)
//        {
//            System.out.println(marks[i]);
//        }

        //displaying the array using  for each

//        for(int element: marks){
//            System.out.println(element);
//        }
//        float [] marks = {45.6f,56.8f,78.8f,89.5f};
////        for(float element:marks)
//        for (int i = 0;i<marks.length;i++)
//        {
//            System.out.println(marks[i]);
//        }
//

//        String [] name= {"suman","suji","harsh"};
//        for(String n:name)
//        {
////            System.out.println(n);
//            System.out.println(n.toUpperCase());
//        }
//
//

        int [] name;  //1D array
        int [][] marks; //2D aaray
        marks = new int[2][3];

        marks[0][0] = 100;
        marks[0][1] =50;
        marks[0][2] =50;
        marks[1][0] =50;
        marks[1][1] =50;
        marks[1][2] =50;

        for(int i =0;i<marks.length;i++)
        {
            for(int j=0;j<marks[i].length;j++)
            {
                System.out.print(marks[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }




    }
}
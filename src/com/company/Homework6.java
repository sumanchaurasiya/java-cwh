package com.company;

public class Homework6 {
    public static void main(String[] args) {

        // create floating array of 5 elements and find their sum

//        float sum=0;
//        float [] num = {67.4f,95.7f,65.3f,75.4f,55.8f};
//        for(float n:num)
//        {
////            System.out.println(n);
//            sum = sum+n;
//        }
//        System.out.println(sum);


        //wap to find whether the given int is present in array or not

//        int [] num = {2,5,8,6,3};
//        int n= 23;
//        boolean v = false;
//        for(int i : num)
//        {
//            if (n==i)
//            {
//                v = true;
//                break;
//            }
//        }
//        if(v)
//        {
//            System.out.println("present in array");
//
//        }
//        else
//        {
//            System.out.println("not present in array");
//        }


        //cal avg marks in 3 sub using for each

//        float [] marks = {78.0f,56.8f,93.5f};
//        float sum = 0;
//        for(float s : marks)
//        {
//            sum = sum+s;
//        }
//        float avg = sum/ marks.length;
//        System.out.println("your avg is " + avg);


        //add 2 matrics of 2
//        int[][] mat1 = {{1, 2, 3},
//                        {4, 5, 6}};
//
//        int [][] mat2 = {{7, 8, 9},
//                        {2,9,4}};
//
//        int [][] mat3 = {{0,0,0},
//                        {0,0,0}};
//
//        for(int i=0;i< mat1.length;i++) {
//            for (int j = 0; j < mat1[i].length; j++) {
//                System.out.format("setting value for i=%d and j = %d \n ",i,j);
////                System.out.print(mat3[i][j] + " ");
//                mat3[i][j] = mat1[i][j] + mat2[i][j];
//
//
//            }
//        }
//
//            for(int i=0;i< mat1.length;i++)
//        {
//            for(int j=0;j< mat1[i].length;j++)
//            {
////                System.out.format("setting value for i=%d and j = %d \n ",i,j);
//                System.out.print(mat3[i][j] + " ");
//                mat3[i][j] = mat1[i][j] + mat2[i][j];
//
//
//            }
//            System.out.println("");
//
//        }

        //prog to reverse an array

//        int [] num = {4,7,5,9,2};
//        int a = num.length;
//        int b = Math.floorDiv(a,2);
//        int temp;
//        for(int i=0;i<b;i++)
//        {
//            temp = num[i];
//            num[i] = num[a-i-1];
//            num[a-i-1] = temp;
//        }
//        for(int c : num) {
//            System.out.println(c);
//
//
        //prog to find biggest no element of an array

//        int[] ele = {3, 5, 2, 7, 9};
//        int temp = Integer.MIN_VALUE;
//        for(int i :ele)
//        {
//            if(i>temp)
//            {
//                temp = i;
//
//            }
//        }
//        System.out.println(temp);
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.MIN_VALUE);


        //find whether an array is sorted or not?

        int [] ele = {1,2,5,6};
        boolean  a = true;
        for(int i = 0;i<ele.length-1;i++)
        {
            if(ele[i]>ele[i+1])
            {
                a=false;
                break;
            }
        }
        if(a)
        {
            System.out.println("array is sorted");
        }
        else
        {
            System.out.println("array is not sorted");
        }
    }

    }

package com.company;

import java.util.*;

public class Advance_1 {
    public static <Arraylist> void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5);

        l1.add(4);
        l1.add(5);
        l1.add(6);
        l1.add(3);
        l1.add(5);
        l1.add(0,6);
        l1.add(0,7);

        l2.add(15);
        l2.add(11);
        l2.add(18);

        l1.addAll(l2);
//        l1.clear();
//        l1.addFirst(34);
        

        System.out.println(l1.contains(15));
        System.out.println(l1.indexOf(6));
        System.out.println(l1.lastIndexOf(6));

        l1.set(4,3);


        for(int i = 0; i < l1.size() ; i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }

    }
}

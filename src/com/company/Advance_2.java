package com.company;
import java.util.*;
public class Advance_2 {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();

        l2.add(2);
        l2.add(5);
        l2.add(7);
        l2.add(24);

        l1.add(45);
        l1.add(54);
        l1.add(77);

        l1.addAll(0,l2);
        l1.addLast(36);
        l1.addFirst(32);
        l1.push(34);
        l1.pop(); 

        for(int i = 0;i< l1.size();i++) {
            System.out.print(l1.get(i));
            System.out.print(", ");
        }

    }
}

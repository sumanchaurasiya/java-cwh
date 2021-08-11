package com.company;

import java.util.*;
public class Advance_3 {
    public static void main(String[] args) {
       ArrayDeque<Integer> ad1 = new ArrayDeque<>();

       ad1.add(50);
       ad1.add(55);
       ad1.add(59);
       ad1.addFirst(69);
       ad1.offerFirst(60);
       ad1.offerLast(36);
       ad1.removeFirst();
       ad1.pollLast();

        System.out.println(ad1);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
    }
}

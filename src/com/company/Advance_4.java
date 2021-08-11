package com.company;

import java.util.HashSet;
public class Advance_4 {
    public static void main(String[] args) {
        HashSet<Integer> h1 = new HashSet<>(10,0.5f);
        HashSet<Integer> h2 = new HashSet<>();

        h1.add(20);
        h1.add(56);
        h1.add(22);
        h1.add(29);
        h1.add(21);
        h1.remove(21);

        System.out.println(h1);
        System.out.println(h2.isEmpty());

//        h1.clear();
        System.out.println(h1.size());

    }
}

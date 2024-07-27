package org.example.collections.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetClass {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();

        for (int i = 10; i >0 ; i--) {
            set.add(i);
        }

        System.out.println(set);

    }
}

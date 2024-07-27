package org.example.collections.set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetClass {
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();
        Set<Integer> hashSet = new HashSet<>();

        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            treeSet.add(r.nextInt(30) + 1);
            hashSet.add(r.nextInt(30) + 1);
        }

        System.out.println("TreeSet: " + treeSet); // 자동으로 오름차순 정렬됨
        System.out.println("HashSet: " + hashSet); // 정렬되지 않음
    }
}
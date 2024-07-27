package org.example.collections.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetClass {
    public static void main(String[] args) {
        Set<Integer> set =  new HashSet<>();

        for (int i = 0; i < 30; i++) {
            set.add(1);
        }

        System.out.println("1만 연속으로 더했을때 : " + set);

        Set<String> set2 = new java.util.HashSet<>();
        for (int i = 0; i < 10; i++) {
            set2.add("1");
        }

        System.out.println("비어있는가?:"+set2.isEmpty());
        System.out.println("1을 포함하는가?:"+set2.contains("1"));
        set2.clear();
        System.out.println(set2);
        System.out.println("set2 = " + set2);


    }


}

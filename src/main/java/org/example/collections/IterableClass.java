package org.example.collections;

import javax.swing.*;
import java.util.*;

public class IterableClass {
    public static void main(String[] args) {

        //iterator를 사용해서 순차적으로 정보 꺼내기
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println(next);
        }

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            map.put(i + "", i);
        }

        map.forEach(
                (s, integer) -> {
                    System.out.println("key: " + s);
                    System.out.println("value :" + integer);
                });
    }
}

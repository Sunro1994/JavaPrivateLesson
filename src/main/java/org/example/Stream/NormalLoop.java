package org.example.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NormalLoop {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        //예를 들어 이름 검색 기능 구현시
        System.out.println("이름 검색 일반 반복문 ");
        List<String> filteredAndSOrtedNames = new ArrayList<>();
        for (String name : names) {
            if (name.startsWith("A") && name.length() >= 4) {
                filteredAndSOrtedNames.add(name);
            }
        }
        Collections.sort(filteredAndSOrtedNames);
        for(String name : filteredAndSOrtedNames) {
            System.out.println(name);
        }
    }
}

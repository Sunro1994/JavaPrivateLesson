package org.example.generic;

import java.util.ArrayList;
import java.util.HashMap;

public class NestedGenericParameterExam {
    public static void main(String[] args) {
        ArrayList<HashMap<String, Integer>> list = new ArrayList<>();

        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);

        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("c", 3);
        map2.put("d", 4);

        list.add(map);
        list.add(map2);

        System.out.println(list);
    }
}

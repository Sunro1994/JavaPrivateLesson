package org.example.collections.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapClass {
    public static void main(String[] args) {
            Map<String, Integer> treeMap = new TreeMap<>();
            treeMap.put("Banana", 2);
            treeMap.put("Apple", 3);
            treeMap.put("Orange", 5);

            System.out.println(treeMap);

            for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            }
        }
}

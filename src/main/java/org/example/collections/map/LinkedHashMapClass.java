package org.example.collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapClass {
    public static void main(String[] args) {
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Apple", 3);
        linkedHashMap.put("Banana", 2);
        linkedHashMap.put("Orange", 5);

        System.out.println(linkedHashMap);

        for (String key : linkedHashMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + linkedHashMap.get(key));
        }
    }
}

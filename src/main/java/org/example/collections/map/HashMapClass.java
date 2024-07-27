package org.example.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapClass {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("철수", 01012341237);
        hashMap.put("짱구", 01012341232);
        hashMap.put("훈이", 01012341233);
        hashMap.put(null, 10); // null 키와 값 허용

        System.out.println(hashMap);

        System.out.println(hashMap.keySet());
        System.out.println(hashMap.values());
        hashMap.entrySet()

        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}

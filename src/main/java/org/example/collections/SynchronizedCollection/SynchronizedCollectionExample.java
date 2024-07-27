package org.example.collections.SynchronizedCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SynchronizedCollectionExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collection<Integer> synchronizedList = Collections.synchronizedCollection(list);

        // 단일 작업은 안전
        synchronizedList.add(1);
        synchronizedList.add(2);
        synchronizedList.add(3);

        // 복합 작업 동기화
        synchronized (synchronizedList) {
            if (!synchronizedList.contains(4)) {
                synchronizedList.add(4);
            }
        }

        // 복합 작업 동기화 (반복 작업)
        synchronized (synchronizedList) {
            for (Integer i : synchronizedList) {
                System.out.println(i);
            }
        }
    }
}

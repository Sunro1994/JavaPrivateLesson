package org.example.Stream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class ParallelStreamExample {
    public static void main(String[] args) {
        // 대량의 데이터 생성 (100만 개의 랜덤 숫자)
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 1_000_000; i++) {
            integerList.add(ThreadLocalRandom.current().nextInt(1, 100));
        }

        long startTime = System.currentTimeMillis();

        // 병렬 스트림 시작
        List<Integer> filteredList = integerList.parallelStream()
                .filter(num -> {
                    // 현재 스레드 이름 출력
                    System.out.println(Thread.currentThread().getName() + " is processing number: " + num);
                    return num > 50;
                })
                .collect(Collectors.toList());

        long sum = filteredList.parallelStream()
                .mapToInt(Integer::intValue)
                .sum();

        long endTime = System.currentTimeMillis();

        System.out.println("Filtered List Size: " + filteredList.size());
        System.out.println("Sum: " + sum);
        System.out.println("Time taken: " + (endTime - startTime) + " ms");
    }
}


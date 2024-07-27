package org.example.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class StreamFinalCalculation {
    public static void main(String[] args) {
        //최종 데이터에서는 합계,평균, 가공된 다른 데이터 컬렉션을 반환하게 된다.

        List<String> list = new ArrayList<>();
        list.add("짱구");
        list.add("훈이");
        list.add("철수");
        list.add("맹구");

        //forEach : 각 요소를 순회하며 출력
        list.stream().forEach(System.out::println);

        //reduce : 요소를 줄여나가며 연산을 수행. 처음 두 요소를 갖고 연산한 결과를 가지고 다음 요소와 연산
        list.stream().reduce((a,b)-> a+b).ifPresent(System.out::println);

        //findFirst(), findAny() : 특정 조건에 맞는 요소를 찾기 위해 사용
        //findFirst()는 시퀀셜처리, findAny는 병렬처리에 사용
        list.add("짱아");
        list.stream().filter(s-> s.startsWith("짱")).findFirst().ifPresent(System.out::println);
        list.stream().filter(s-> s.startsWith("짱")).findAny().ifPresent(System.out::println);

        //anyMatch(), allMatch(), noneMatch() : 조건에 맞는지 확인을 위해 사용
        boolean isExist = list.stream().anyMatch(i -> i.equals("짱아"));
        System.out.println(isExist);

        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integerList.add(i);
        }
        //count,min,max : 요소의 개수, 최소값, 최대값을 구하기 위해 사용
        integerList.stream().max(Integer::compareTo).ifPresent(System.out::println);
        integerList.stream().max((o1, o2) -> o1 - o2).ifPresent(System.out::println);
        integerList.stream().min(Integer::compareTo).ifPresent(System.out::println);
        long count = integerList.stream().count();
        System.out.println("count:" + count);

        //sum(), average() : 합계, 평균 값을 구하기 위해 사용
        int sum = integerList.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("sum: " + sum);

        // average() : 평균 값 구하기
        integerList.stream()
                .mapToInt(Integer::intValue)
                .average().ifPresent(avg-> System.out.println(avg));

    }


}

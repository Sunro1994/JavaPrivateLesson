package org.example.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamProduce {
    public static void main(String[] args) {
        //생성
        // 배열, ArrayList, Set, Map 등으로 생성할 수 있다.

        //List를 스트림으로 생성
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Grape");

        Stream<String> stream = list.stream();

        //Arrays를 stream으로 생성
        String[] array = {"Apple", "Banana", "Grape"};
        Stream<String> stream1 = Arrays.stream(array);
        Stream<String> stream2 = Stream.of(array);

        //generate, iterate를 사용해서 임의의 데이터 생성도 가능하다.
        Stream<String> tempStringStream = Stream.generate(() -> "Hello").limit(5);

        //5차례의 중간연산을 통해 임의의 값을 생성
        Stream<Integer> tempIntStream = Stream.iterate(1, n -> n * 2).limit(5);

        //1부터 100까지 연속된 값을 stream으로 생성
        IntStream intStream = IntStream.rangeClosed(1, 100);
        Stream<Integer> tempIntStream2 = Stream.iterate(1, n -> n + 1).limit(100);

        //1-100사이의 범위를 갖는 10개의 난수 생성
        Random r = new Random();
        Stream<Integer> randomStream1 = Stream.generate(() -> r.nextInt(100) + 1).limit(10);
        IntStream randomStream2 = r.ints(1, 101).limit(10);
    }
}

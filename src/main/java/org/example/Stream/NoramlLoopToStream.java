package org.example.Stream;

import java.util.Arrays;
import java.util.List;

public class NoramlLoopToStream {
    public static void main(String[] args) {
    List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

    // 이름이 "A"로 시작하고 길이가 4자 이상인 사랃의 이름을 찾아서 정렬하여 출력
        System.out.println("Using Steram API");
        names.stream()
                .filter(name->
                        name.startsWith("A") && name.length()>=4)
                .sorted()
                .forEach(System.out::println);
    }

}

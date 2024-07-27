package org.example.lamda.lamdaExam1;

import java.util.Arrays;
import java.util.List;

public class TestFunctionInterface {
    public static void main(String[] args) {
        // 예제 리스트
        List<String> list = Arrays.asList("banana", "apple", "cherry", "date");

        // Comparator 인터페이스를 구현하는 람다 표현식
        Comparator<String> comparator = (s1, s2) -> s1.compareTo(s2);

        // Collections 클래스의 sort 메서드를 사용하여 정렬
        Collections.sort(list, comparator);

        // 정렬된 리스트 출력
        System.out.println(list);

        // 역순 정렬 예제
        Comparator<String> reverseComparator = (s1, s2) -> s2.compareTo(s1);
        Collections.sort(list, reverseComparator);
        System.out.println(list);
    }
}

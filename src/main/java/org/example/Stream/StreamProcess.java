package org.example.Stream;


import java.util.stream.IntStream;

public class StreamProcess {
    public static void main(String[] args) {

        //filter,map등을 통해 입맛대로 가공이 가능하다!

        //1부터 100 사이 숫자 중에 짝수만 걸러내는 연산
        IntStream filterSteram1 = IntStream.rangeClosed(1, 100).filter(n -> n % 2 == 0);
        filterSteram1.forEach(System.out::println);

        //1부터 100까지의 숫자를 제곱하여 변환하는 연산
        IntStream mapStream = IntStream.rangeClosed(1, 100).map(n -> n * n);
        mapStream.forEach(System.out::println);

        //1부터 100까지의 숫자를 정렬
        IntStream.rangeClosed(1, 100).sorted();

        //1부터 100까지 숫자중 10으로 나눈 나머지값 출력하기
        //peak은 중간연산이 잘 되고 있는지 확인하는 용도
        IntStream.rangeClosed(1,100).map(n-> n%10).peek(n-> System.out.println(n));

        //중복 제거
        IntStream.rangeClosed(1, 100).map(n -> n % 10).distinct();

        //limit 개수 제한
        IntStream.rangeClosed(1, 100).limit(10);



    }
}

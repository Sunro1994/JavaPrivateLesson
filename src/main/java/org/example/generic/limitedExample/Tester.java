package org.example.generic.limitedExample;

public class Tester {
    public static void main(String[] args) {
        //타입 파라미터에 인터페이스를 구현한 클래스만이 올 수 있다.
        School<Student> exam = new School<>();
    }
}

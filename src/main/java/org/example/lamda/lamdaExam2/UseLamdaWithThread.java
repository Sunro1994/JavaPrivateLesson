package org.example.lamda.lamdaExam2;

public class UseLamdaWithThread {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("쓰레드 호출");
        });

        thread.run();
    }
}

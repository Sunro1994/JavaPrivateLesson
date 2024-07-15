package org.example.lamda.lamdaExam1;

import java.util.Arrays;
import java.util.List;

public class TestFunctionInterface {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("aaa", "cc", "eee", "dddd");

        Collections.sort(words, (s1,s2)-> Integer.compare(s1.length() , s2.length()));

        System.out.println(words);

    }
}

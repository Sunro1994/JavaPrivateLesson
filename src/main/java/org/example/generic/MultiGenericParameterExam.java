package org.example.generic;

import java.util.ArrayList;
import java.util.List;

public class MultiGenericParameterExam<T,U>{

    List<T> apples = new ArrayList<>();
    List<U> bananas = new ArrayList<>();

    public void add(T apple, U banana) {
        apples.add(apple);
        bananas.add(banana);
    }
}

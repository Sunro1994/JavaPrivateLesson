package org.example.generic;

import java.util.ArrayList;
import java.util.List;

public class OneGenericParameterExam<T> {
    List<T> list = new ArrayList<>();

    public void add(T exam) {
        list.add(exam);
    }
}

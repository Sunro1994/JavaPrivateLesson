package org.example.lamda.lamdaExam1;

import java.util.List;

public class Collections {

    public static <T> void sort(List<T> list, Comparator<? super T> c) {
        list.sort(c);
    }
}

package org.example.lamda.lamdaExam1;

@FunctionalInterface
public interface Comparator<T> extends java.util.Comparator<T> {
    int compare(T o1, T o2);
}

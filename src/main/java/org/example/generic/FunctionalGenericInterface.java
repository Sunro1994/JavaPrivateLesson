package org.example.generic;

public interface FunctionalGenericInterface<T> {
    public T add(T t, T y);

    public static void main(String[] args) {
        FunctionalGenericInterface<Integer> exam = (x, y) -> x + y;
        Integer result = exam.add(10, 20);
        System.out.println(result);


    }
}


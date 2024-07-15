package org.example.generic;

public class LimitedGenericClass<T extends Number> {
    void add(T a, T b) {}
    void min(T a, T b) {}
    void mul(T a, T b) {}
    void div(T a, T b) {}

    public static void main(String[] args) {
        LimitedGenericClass<Number> cal1 = new LimitedGenericClass<>();
        LimitedGenericClass<Integer> cal2 = new LimitedGenericClass<>();
        LimitedGenericClass<Double> cal3 = new LimitedGenericClass<>();

        //범위 밖이므로 컴파일 오류
//        LimitedGenericClass<String> cal4 = new LimitedGenericClass<String>();
    }
}

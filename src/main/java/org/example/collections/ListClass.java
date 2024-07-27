package org.example.collections;

import java.util.ArrayList;
import java.util.List;

public class ListClass {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        List<String> insertedList = new ArrayList<>();

        insertedList.add("1");
        insertedList.add("2");
        insertedList.add("3");


        list.add("1");
        list.addAll(0,insertedList);
        System.out.println("삽입 후 list: " + list);
        list.remove("1");
        System.out.println("1제거 후 lsit: " + list);
        list.remove(1);
        System.out.println("1번째 인덱스 제거 후 list: "  + list);
        System.out.println("0번째 인덱스:"+ list.get(0));
        System.out.println("2의 위치:" + list.indexOf("2"));
        System.out.println("0~1까지 인덱스의 리스트:"+ list.subList(0,1));
        list.add("3");
        list.add("1");
        list.sort((o1, o2) -> Integer.valueOf(o2) - Integer.valueOf(o1));
    }

}

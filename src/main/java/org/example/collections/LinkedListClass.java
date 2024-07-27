package org.example.collections;

import java.util.*;

public class LinkedListClass {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        Deque<Integer> list2 = new LinkedList<>();
        Queue<Integer> list3 = new LinkedList<>();

        for (int i = 90; i < 99; i++) {
            Random r = new Random();
            list.add(i);
            list2.add(i);
            list3.add(i);
        }

        //list
        list.add(1);
        list.remove(1);

        //Deque
        list2.addFirst(1);
        System.out.println("list2.addFirst = " + list2);
        list2.addLast(1);
        System.out.println("list2.addLast = " + list2);
        System.out.println("list2.peekFirst = " + list2.peekFirst());
        System.out.println("list2.peekLast = " + list2.peekLast());
        System.out.println("list2=" + list2);
        System.out.println("list2.pollFirst="+ list2.pollFirst());
        System.out.println("list2.pollLast="+ list2.pollLast());
        System.out.println("list2 = " + list2);

    }
}

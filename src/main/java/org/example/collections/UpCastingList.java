package org.example.collections;

import java.util.*;

public class UpCastingList {
    public static void main(String[] args) {
        //최상위 클래스이기 때문에 업캐스팅으로 다형성이 가능하다.
        Collection<String> collection;

        collection =  new ArrayList<>();


        collection = new HashSet<>();

    }
}

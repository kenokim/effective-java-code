package org.example.chapter1.item1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListSortExample {

    public static void main(String[] args) {

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        };

        List<Integer> list = Arrays.asList(1, 2, 5, 1, 3);
        list.sort(comparator.reversed());

        System.out.println(list);
    }
}

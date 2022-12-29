package org.example.chapter1.item1;

public interface HelloService {
    String hello();

    static String hi() {
        return "hi";
    }

    default String hi2() {
        return "hi2";
    }

}

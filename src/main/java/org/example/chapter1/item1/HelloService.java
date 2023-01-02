package org.example.chapter1.item1;

public interface HelloService {
    String hello();

    static String hi() {
        prepare();
        return "hi";
    }

    static private void prepare() {

    }

    static public String message() {
        return "";
    }

    default String hi2() {
        return "hi2";
    }
}

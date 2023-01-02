package org.example.chapter1.item1;

public class ChineseHelloService implements HelloService {
    @Override
    public String hello() {
        return null;
    }

    @Override
    public String hi2() {
        return HelloService.super.hi2();
    }
}

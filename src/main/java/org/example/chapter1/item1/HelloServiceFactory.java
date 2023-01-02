package org.example.chapter1.item1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class HelloServiceFactory {
    public static void main(String[] args) throws NoSuchMethodException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> aClass = Class.forName("org.example.chapter1.item1.ChineseHelloService");
        Constructor<?> constructor = aClass.getConstructor();
        HelloService helloService = (HelloService) constructor.newInstance();

    }
}

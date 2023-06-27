package com.example.app;

import java.util.Iterator;
import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) {
        for (Hello hello : ServiceLoader.load(Hello.class)) {
            System.out.println(hello.hello());
        }
    }
}
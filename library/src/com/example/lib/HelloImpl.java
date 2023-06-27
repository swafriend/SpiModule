package com.example.lib;

import com.example.app.Hello;

public class HelloImpl implements com.example.app.Hello {
    @Override
    public String hello() {
        return "Hello, SPI!";
    }
}

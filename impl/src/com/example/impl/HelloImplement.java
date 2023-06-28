package com.example.impl;

import com.example.app.Hello;

public class HelloImplement implements com.example.app.Hello {

    // library.imp
    // <orderEntry type="module" module-name="application" />
    @Override
    public String hello() {
        return "Hello, SPI Impl2 !";
    }
}

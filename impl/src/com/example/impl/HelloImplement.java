package com.example.lib;

import com.example.app.Hello;

public class HelloImpl implements com.example.app.Hello {

    // library.imp
    // <orderEntry type="module" module-name="application" />
    // モジュールの依存関係でapplicationを追加しないと参照できない。
    @Override
    public String hello() {
        return "Hello, SPI!";
    }
}

module impl {
    exports com.example.impl;
    requires application;
    provides com.example.app.Hello with com.example.impl.HelloImplement;
}
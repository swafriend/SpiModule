module library {
    exports com.example.lib;
    requires application;
    provides com.example.app.Hello with com.example.lib.HelloImpl;
}
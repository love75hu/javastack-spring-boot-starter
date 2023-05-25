package cn.mediinfo.javastackspringbootstarter.service;

import lombok.Data;


public class TestService {
    private final String message;

    public TestService(String message) {
        this.message = message;
    }

    public String sayHello() {
        return "Hello, " + message;
    }
}

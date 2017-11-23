package com.lyk.spring.definition;

public class HelloWorldImpl implements HelloWorld {
    private String message;

    public HelloWorldImpl() {
        this.message = "Hello World";
    }

    public HelloWorldImpl(String message){
        this.message = message;
    }

    @Override
    public void sayHello() {
        System.out.println(this.message);
    }
}

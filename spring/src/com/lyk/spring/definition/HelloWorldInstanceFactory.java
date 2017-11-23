package com.lyk.spring.definition;

public class HelloWorldInstanceFactory {
    public HelloWorld newInstance(String message){
        return  new HelloWorldImpl(message);
    }
}

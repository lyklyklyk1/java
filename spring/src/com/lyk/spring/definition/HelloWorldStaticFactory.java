package com.lyk.spring.definition;

public class HelloWorldStaticFactory {
    public static HelloWorld newInstance(String message){
        return new HelloWorldImpl(message);
    }
}

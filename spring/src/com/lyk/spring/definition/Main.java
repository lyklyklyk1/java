package com.lyk.spring.definition;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //sayHelloWorldByClass();
        //sayHelloWorldById();
        //sayHelloWorldByName();
        //sayHelloWorldByNameAndId();
        //sayHelloWorldWithNoAgrs();
        //sayHelloWorldWithAgrs();
        //sayHelloWorldStaticFactory();
        sayHelloWorldInstanceFactory();
    }
    public static void sayHelloWorldInstanceFactory() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("conf/conf-definition.xml");
        HelloWorld helloWorld = beanFactory.getBean("helloWorldInstaceFactory", HelloWorld.class);
        helloWorld.sayHello();
    }

    public static void sayHelloWorldStaticFactory() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("conf/conf-definition.xml");
        HelloWorld helloWorld = beanFactory.getBean("helloWorldStatiFactory", HelloWorld.class);
        helloWorld.sayHello();
    }

    public static void sayHelloWorldWithNoAgrs() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("conf/conf-definition.xml");
        HelloWorld helloWorld = beanFactory.getBean("helloWorldWithNoArgs", HelloWorld.class);
        helloWorld.sayHello();
    }
    public static void sayHelloWorldWithAgrs() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("conf/conf-definition.xml");
        HelloWorld helloWorld = beanFactory.getBean("helloWorldWithArgs", HelloWorld.class);
        helloWorld.sayHello();
    }

    public static void sayHelloWorldById() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("conf/conf-definition.xml");
        HelloWorld helloWorld = beanFactory.getBean("helloWorld", HelloWorld.class);
        helloWorld.sayHello();
    }

    public static void sayHelloWorldByClass() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("conf/conf-definition.xml");
        HelloWorld helloWorld = beanFactory.getBean(HelloWorldImpl.class);
        helloWorld.sayHello();
    }

    public static void sayHelloWorldByName() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("conf/conf-definition.xml");
        HelloWorld helloWorld = beanFactory.getBean("helloWorldByName", HelloWorldImpl.class);
        helloWorld.sayHello();
    }
    public static void sayHelloWorldByNameAndId() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("conf/conf-definition.xml");
        HelloWorld helloWorldName = beanFactory.getBean("helloWorldByName01", HelloWorldImpl.class);
        helloWorldName.sayHello();
        HelloWorld helloWorldId = beanFactory.getBean("helloWorldById", HelloWorldImpl.class);
        helloWorldId.sayHello();
    }
}

package com.test.testexternalproperties;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PropertiesLoader {

    @Value("${test.integer}")
    private int testInteger;

    @Value("${test.string.foo}")
    private String fooString;

    @Value("${test.string.bar}")
    private String barString;

    @PostConstruct
    public void init() {
        System.out.println("Test integer: " + testInteger);
        System.out.println("Test foo: " + fooString);
        System.out.println("Test bar: " + barString);
    }
}

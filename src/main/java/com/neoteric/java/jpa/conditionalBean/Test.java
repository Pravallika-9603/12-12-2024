package com.neoteric.java.jpa.conditionalBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        System.setProperty("webServicetype","rest");
        ApplicationContext context =new AnnotationConfigApplicationContext("com.neoteric.java.jpa.conditionalBean");
        WebServiceClientService webServiceClientService=context.getBean(WebServiceClientService.class);
        webServiceClientService.test();

    }
}

package com.neoteric.java.jpa.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

        public static void main(String[] args) {
            ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
            Department department=(Department)context.getBean("string");
            System.out.println(department);
        }

    }


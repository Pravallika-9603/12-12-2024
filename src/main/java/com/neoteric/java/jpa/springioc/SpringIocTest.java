package com.neoteric.java.jpa.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringIocTest {
    public static void main(String[] args) {
      ApplicationContext context =new AnnotationConfigApplicationContext("com.neoteric.java.jpa.springioc");

      EmployeeService employeeService = context.getBean("employeeService", EmployeeService.class);
      employeeService.project();

    }
}

package com.neoteric.java.jpa.springioc;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Pointcut("execution(* com.neoteric.java.jpa.springioc..*(..))")
    public void logging() {
    }


    @Around("logging()")
    public  Object external(ProceedingJoinPoint joinPoint) throws Throwable{

        String methodName= joinPoint.getSignature().getName();

        long start=System.currentTimeMillis();
        System.out.println("Enter "+methodName);
        Object [] args= joinPoint.getArgs();
        Object result =joinPoint.proceed();
        System.out.println("Exit "+methodName);
        long end=System.currentTimeMillis();
        return result;
    }

}

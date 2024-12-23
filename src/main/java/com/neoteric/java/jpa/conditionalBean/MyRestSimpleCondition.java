package com.neoteric.java.jpa.conditionalBean;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class MyRestSimpleCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        System.out.println(System.getProperty("webServicetype"));
        String type=System.getProperty("webServicetype");
        if(type.equals("rest")){
            return true;
        }
        return false;
    }
}

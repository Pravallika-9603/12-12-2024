package com.neoteric.java.jpa.conditionalBean;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class MySoapSimpleCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        String type=System.getProperty("webServicetype");
        if(type.equals("soap")){
            return true;
        }
        return false;
    }

}

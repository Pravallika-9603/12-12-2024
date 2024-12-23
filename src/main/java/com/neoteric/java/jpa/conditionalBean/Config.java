package com.neoteric.java.jpa.conditionalBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan(basePackages = {"com.neoteric.java.jpa.conditionalBean"})
public class Config {


        @Conditional(MySoapSimpleCondition.class)
        @Bean
        public IntegrationWebService soapIntegration(){
            return new SoapWebService();
        }

        @Bean
        @Conditional(MyRestSimpleCondition.class)
        public IntegrationWebService restIntegration(){
            return new RestWebService();
        }

    }




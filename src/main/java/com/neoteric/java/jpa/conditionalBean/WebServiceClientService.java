package com.neoteric.java.jpa.conditionalBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class WebServiceClientService {
    public WebServiceClientService(){
        System.out.println("WebServiceClientService constructor");
    }

    @Autowired
    IntegrationWebService integrationWebService;

    public void test(){
        this.integrationWebService.sendData();
    }
}

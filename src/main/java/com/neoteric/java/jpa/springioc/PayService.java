package com.neoteric.java.jpa.springioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PayService {
    ExternalJavaService externalJavaService;

    public PayService(@Autowired ExternalJavaService externalJavaService){
        this.externalJavaService= externalJavaService;
    }

    public void pay(){
        System.out.println("from pay");
        externalJavaService.external();
    }
}

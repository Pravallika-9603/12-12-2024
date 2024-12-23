package com.neoteric.java.jpa.conditionalBean;

public class SoapWebService implements IntegrationWebService{

        public SoapWebService(){
            System.out.println("SoapWebService constructor");
        }

        @Override
        public void sendData() {
            System.out.println("SoapWebService");
        }
    }



package com.neoteric.java.jpa.conditionalBean;

public class RestWebService implements IntegrationWebService{

        public RestWebService(){
            System.out.println("RestWebService constructor");
        }

        @Override
        public void sendData() {
            System.out.println("RestWebService");
        }
    }



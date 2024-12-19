package com.neoteric.java.jpa.manytomany;

public class SingletonClass {

    public static SingletonCheck singletonCheck;

    public static SingletonCheck getInstance(){
        if(singletonCheck==null){
            return new SingletonCheck();
        }
        else {
            return singletonCheck;
        }
    }
}

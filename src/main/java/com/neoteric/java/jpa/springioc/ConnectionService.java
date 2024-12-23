package com.neoteric.java.jpa.springioc;

public interface ConnectionService {
    public NeoConnection getConnection(String url,String userName,String password);
}

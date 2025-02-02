package com.neoteric.java.jpa.springioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@ComponentScan
@Configuration
public class SpringCoreConfiguration {

    @Bean(name = "externalJavaService")
    public ExternalJavaService getExternalJavaService(){
        ExternalJavaService externalJavaService= new ExternalJavaService();
        return new ExternalJavaService();
    }

    @Bean
    public TCPConnectionService tcpConnectionService(){
        return new TCPConnectionService();
    }

    @Bean
    public ConnectionService mysqlConnectionService(TCPConnectionService tcpConnectionService){

        return new MysqlConnectionService(tcpConnectionService());
    }
    @Bean
    public ConnectionService oracleConnectionService(TCPConnectionService tcpConnectionService){

        return new OracleConnectionService(tcpConnectionService());
    }
}

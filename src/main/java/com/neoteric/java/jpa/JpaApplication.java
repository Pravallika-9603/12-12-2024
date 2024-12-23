package com.neoteric.java.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {


		ConfigurableApplicationContext context=
				SpringApplication.run(JpaApplication.class, args);


	}

}

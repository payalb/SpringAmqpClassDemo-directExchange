package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringAmqp1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringAmqp1Application.class, args);
		
		//context.registerShutdownHook();
	}
}

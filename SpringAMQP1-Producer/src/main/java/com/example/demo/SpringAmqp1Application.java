package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.service.MyProducer;

@SpringBootApplication
public class SpringAmqp1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringAmqp1Application.class, args);
		MyProducer producer=context.getBean(MyProducer.class);
		producer.sendMessage();
		context.registerShutdownHook();
	}
}

package com.example.demo.config;

import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.core.ExchangeBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProducerConfig {
	
	//Producer will send message to exchange
	
	@Bean
	public Exchange exchange() {
	//	return new DirectExchange("myexchange");
	return	ExchangeBuilder.directExchange("myExchange").durable(true).build();
	}
	
	

}

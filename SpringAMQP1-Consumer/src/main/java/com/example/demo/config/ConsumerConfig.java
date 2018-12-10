package com.example.demo.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.core.ExchangeBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.QueueBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConsumerConfig {
	
	//Producer will send message to exchange
	
	@Bean
	public Exchange exchange() {
	//	return new DirectExchange("myexchange");
	return	ExchangeBuilder.directExchange("myExchange").durable(true).build();
	}
	
	@Bean
	public Queue queue() {
		//return new Queue("q1");
		return QueueBuilder.durable("q1").withArgument("x-message-ttl", 30000).build();
	}
	
	@Bean
	public Binding binding() {
		return BindingBuilder.bind(queue()).to(exchange()).with("delivery").noargs();
	}
}

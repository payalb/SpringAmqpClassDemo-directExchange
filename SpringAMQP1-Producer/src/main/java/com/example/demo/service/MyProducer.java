package com.example.demo.service;

import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dto.Order;

@Component
public class MyProducer {
	
	@Autowired RabbitTemplate template;

	@Autowired Exchange exchange;
	
	public void sendMessage() {
		//Write code to convert it to a proper format before sending over
		Order order=new Order(1, 623532.50f, "10R, delhi road", "P142", 9599160595l);
		System.out.println(template);
		System.out.println(order);
		template.convertAndSend(exchange.getName(), "delivery", order);
	}
}

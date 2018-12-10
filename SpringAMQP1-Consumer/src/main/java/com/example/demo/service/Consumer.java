package com.example.demo.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
	
	@RabbitListener(queues="q1")
	public void printMessage(String str) {
		System.out.println(str);
	}
}

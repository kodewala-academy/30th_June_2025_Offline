package com.kodewala.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

	@Bean("order")
	public Order createOrderBean() {
		Order order = new Order();
		order.setOrderId(12345);
		order.setItemName("iphone11");
		order.setStatus("PENDING");
		return order;
	}

	@Bean("order1")
	public Order createOrder() {
		Order order = new Order();
		order.setOrderId(12345);
		order.setItemName("iphone12");
		order.setStatus("PENDING");
		return order;
	}

}

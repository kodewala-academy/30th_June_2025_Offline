package com.zepto.payment.service.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

	private PaymentService paymentService;

	// Constructor dependency --> When dependencies are mandatory and immutable
	public OrderService(PaymentService _paymentService) {

		this.paymentService = _paymentService;
	}
	
	// Setter dependency, dependency is optional. mutable
	@Autowired
	public void setPayment(PaymentService _paymentService) 
	{
		this.paymentService = _paymentService;
	}
	// Filed injection. hard to test....
	@Autowired
	PaymentService paymentService1;
}

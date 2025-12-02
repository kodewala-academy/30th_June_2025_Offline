package com.zepto.payment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zepto.payment.request.PaymentRequest;
import com.zepto.payment.service.PaymentService;
import com.zepto.payment.service.UpiPayment;

@Controller // restcontroller = controller + responsebody
public class PaymentController {

	@Qualifier("cardPayment")
	@Autowired
	PaymentService paymentService ; // new UpiPayment() // new CardPayment() ; // trying to autowire (cardPayment,upiPayment)

	@PostMapping("confirmPayment")
	@ResponseBody
	public ResponseEntity confirmPayment(@RequestBody PaymentRequest paymentRequest) {

		paymentService.pay();
		
		return ResponseEntity.ok(null);
	}
}

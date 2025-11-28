package com.zepto.order.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zepto.order.controller.request.OrderInput;

@RestController
public class OrderController {

	@PostMapping("placeOrder")
	public ResponseEntity placeOrder(@RequestBody OrderInput orderInput) {
		System.out.println(" Order details :" + orderInput.getItemName() + " " + orderInput.getProductId());
      
		return ResponseEntity.ok("Order received"); // response back to client
	}

}

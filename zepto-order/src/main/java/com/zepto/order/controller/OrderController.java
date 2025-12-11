package com.zepto.order.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zepto.order.request.OrderRequest;

@RestController
public class OrderController {

	@PostMapping("processOrder")
	public ResponseEntity<String> processOrder(@RequestBody OrderRequest orderRequest) {

		System.out.println(" item name " + orderRequest.getItemName());
		return ResponseEntity.ok("Request received and will be processed soon....");

	}

}

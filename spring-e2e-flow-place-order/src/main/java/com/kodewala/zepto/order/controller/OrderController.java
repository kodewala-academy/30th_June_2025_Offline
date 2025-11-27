package com.kodewala.zepto.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kodewala.zepto.order.bean.OrderInfo;
import com.kodewala.zepto.order.service.OrderService;

@Controller
public class OrderController {

	@Autowired
	OrderService orderService;

	@RequestMapping("orderPage")
	public String showOrderPage() {
		System.out.println(" Showing order page::::::::::::::;");
		return "order";
	}

	@PostMapping("placeOrder")
	public String placeOrder(@ModelAttribute OrderInfo order, Model model) {
		System.out.println("OrderController: Item Name " + order.getItem());
		int orderId = orderService.createOrder(order);
		model.addAttribute("orderId", orderId);
		return "order-success";
	}

}

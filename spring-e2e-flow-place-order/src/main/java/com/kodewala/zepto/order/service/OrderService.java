package com.kodewala.zepto.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodewala.zepto.order.bean.OrderInfo;
import com.kodewala.zepto.order.controller.OrderController;
import com.kodewala.zepto.order.dao.OrderDAO;
import com.kodewala.zepto.order.entity.Order;

@Service
public class OrderService {

    private final OrderController orderController;

	@Autowired
	OrderDAO orderDAO;

    OrderService(OrderController orderController) {
        this.orderController = orderController;
    }

	public int createOrder(OrderInfo orderInfo) {
		System.out.println("OrderService: Item Name " + orderInfo.getItem());

		Order orderEntity = new Order();
		
		orderEntity.setItem(orderInfo.getItem());
		orderEntity.setQty(orderInfo.getQty());
		orderEntity.setPrice(orderInfo.getPrice());
		orderEntity.setAddress(orderInfo.getAddress());
		
		int orderId = orderDAO.saveOrder(orderEntity);
		return orderId;
	}
}

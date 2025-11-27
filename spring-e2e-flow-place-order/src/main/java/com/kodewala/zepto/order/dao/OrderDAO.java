package com.kodewala.zepto.order.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kodewala.zepto.order.entity.Order;

@Repository
public class OrderDAO {

	@Autowired
	SessionFactory sessionFactory;

	public int saveOrder(Order orderEntity) {
		System.out.println("OrderDAO: Item Name " + orderEntity.getItem());
		Session session = sessionFactory.openSession();
		Transaction txn = session.beginTransaction();
		System.out.println("OrderDAO.saveOrder()::: STARTING");
		Integer response =  (Integer) session.save(orderEntity);
		txn.commit();
		System.out.println("OrderDAO.saveOrder()::: COMPLETED and " + response);
		return response;
	}
}

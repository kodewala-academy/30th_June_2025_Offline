package com.kodewala;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
       
		String config = "\\com\\kodewala\\resources\\applicationContext.xml";
		
		// create spring IOC container
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);

		// accessing the bean from the ioc container.
		Account account = (Account) applicationContext.getBean("acc");
		System.out.println(account.getAccountNumber() + " " + account.getType() + " " + account.getIfsc());
	}
}

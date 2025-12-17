package com.ecom.product.search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SearchProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(SearchProductApplication.class, args);
	}

}

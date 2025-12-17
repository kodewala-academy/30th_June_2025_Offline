package com.ecom.product.search.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.ecom.product.search.entity.Product;
import com.ecom.product.search.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;

	@Cacheable(value = "products-new", key = "#name", unless = "#result == null")
	public Product searchProduct(String name) {
		System.out.println("Fetching from DB...");
		return productRepository.findByName(name).orElseThrow(() -> new RuntimeException("Product not found"));
	}
}

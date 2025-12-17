package com.ecom.product.search.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.ecom.product.search.SearchProductApplication;
import com.ecom.product.search.entity.Product;
import com.ecom.product.search.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final SearchProductApplication searchProductApplication;

	@Autowired
	ProductService productService;

    ProductController(SearchProductApplication searchProductApplication) {
        this.searchProductApplication = searchProductApplication;
    }

	@GetMapping("/search")
	public Product search(@RequestParam String name) {
		System.out.println("ProductController.search() sending start time to APM and action name");
		System.out.println("ProductController.search()..........................................");
		System.out.println("ProductController.search() sending start time to APM and action name");
		return productService.searchProduct(name);
		
	}
}

package com.zepto.search.serivce;

import org.springframework.stereotype.Service;

import com.zepto.search.exception.ProductNotFoundExcpetion;

@Service
public class ProductService {

	public void findProductBySearchString(String _searchString) {
		boolean isProductFound = true;

		if (isProductFound) {
			// throw new ProductNotFoundExcpetion("Product not Found");
			String s1 = null;
			s1.length();
		} else {
			// send the product search results....
		}
	}
}

package com.RedWater.blood_bank.controllers;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.RedWater.blood_bank.models.Product;
import com.RedWater.blood_bank.services.ProductService;

@RestController
@RequestMapping("/products")
public class ProdutController {
	@Autowired
	private ProductService productService;
	@GetMapping
	public List<Product> getAllProducts() {
		return productService.getAllProducts();
	}
	@GetMapping("/category")
	public List<Map<String,Object>> getCategoryProducts() {
		return Arrays.asList(
				Map.of("name","id","blood_type","fd","jaibhim","surya"),
				Map.of("name","id","blood_type","fd")
				);
	}


}

package com.RedWater.blood_bank.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RedWater.blood_bank.models.Product;
import com.RedWater.blood_bank.repositories.Productrepositories;

@Service
public class ProductService {
	@Autowired
	private Productrepositories productRepositories;
	
	public List<Product> getAllProducts()
	{
		return productRepositories.findAll();
	}
}

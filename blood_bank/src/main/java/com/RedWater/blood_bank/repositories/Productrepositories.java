package com.RedWater.blood_bank.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.RedWater.blood_bank.models.Product;

@Repository
public interface Productrepositories extends JpaRepository<Product,Long>{

}

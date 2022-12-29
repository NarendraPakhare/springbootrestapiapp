package com.infy.springbootrestapicrudapp.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infy.springbootrestapicrudapp.app.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>
{
	public void deleteByProductId(int pid);
}

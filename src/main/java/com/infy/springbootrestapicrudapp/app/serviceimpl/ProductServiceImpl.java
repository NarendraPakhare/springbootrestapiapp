package com.infy.springbootrestapicrudapp.app.serviceimpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.springbootrestapicrudapp.app.model.Product;
import com.infy.springbootrestapicrudapp.app.repository.ProductRepository;
import com.infy.springbootrestapicrudapp.app.service.ProductService;

@Service
@Transactional
public class ProductServiceImpl implements ProductService
{
	@Autowired
	ProductRepository pr;
	
	public Product saveProduct(Product p)
	{
		return pr.save(p);
	}
	
	public Iterable<Product> getProduct()
	{
		return pr.findAll();
	}
	
	public void deleteProduct(int pid)
	{
		pr.deleteByProductId(pid);
	}
}

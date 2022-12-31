package com.infy.springbootrestapicrudapp.app.serviceimpl;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.springbootrestapicrudapp.app.exception.findByIdException;
import com.infy.springbootrestapicrudapp.app.model.Product;
import com.infy.springbootrestapicrudapp.app.repository.ProductRepository;
import com.infy.springbootrestapicrudapp.app.service.ProductService;

@Service
@Transactional
public class ProductServiceImpl implements ProductService
{
	@Autowired
	ProductRepository pr;
	
	public Product saveProduct(Product product)
	{
		return pr.save(product);
	}
	
	public Iterable<Product> getProduct()
	{
		return pr.findAll();
	}
	
	public void deleteProduct(int productid)
	{
		Optional<Product> op = pr.findById(productid);
		if(op.isPresent())
		{
			pr.deleteByProductId(productid);
		}
		else
		{
			throw new findByIdException("No Product present with the ID...");
		}
		
	}
	
	public boolean ExistProduct(int productId)
	{
		return pr.existsById(productId);
	}
	
}

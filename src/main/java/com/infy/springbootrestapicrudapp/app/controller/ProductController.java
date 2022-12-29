package com.infy.springbootrestapicrudapp.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.springbootrestapicrudapp.app.model.Product;
import com.infy.springbootrestapicrudapp.app.service.ProductService;
@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class ProductController 
{
	@Autowired
	ProductService ps;
	
	@PostMapping(value = "/saveProduct")
	public Product saveProduct(@RequestBody Product p)
	{
		Product product = ps.saveProduct(p);
		return null;
	}
	
	@GetMapping(value = "/getProduct")
	public Iterable<Product> getProduct()
	{
		return ps.getProduct();
	}
	
	@PutMapping(value = "/updateProduct")
	public void updateProduct(@RequestBody Product p)
	{
		ps.saveProduct(p);
	}
	
	@DeleteMapping(value = "/deleteProduct/{pid}")
	public void deleteProduct(@PathVariable("pid") int pid)
	{
		ps.deleteProduct(pid);
	}
}

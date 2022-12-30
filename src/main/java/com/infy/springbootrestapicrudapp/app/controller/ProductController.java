package com.infy.springbootrestapicrudapp.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	
	@PostMapping(value = "/product")
	public ResponseEntity<Product> saveProduct(@RequestBody Product p)
	{	
		Product product = ps.saveProduct(p);
		return new ResponseEntity<Product>(product, HttpStatus.CREATED );
	}
	
	@GetMapping(value = "/product")
	public ResponseEntity<Iterable<Product>> getProduct()
	{
		Iterable<Product> products = ps.getProduct();
		return new ResponseEntity<Iterable<Product>>(products, HttpStatus.OK);
	}
	
	@PutMapping(value = "/product/{productId}")
	public ResponseEntity<Product> updateProduct(@PathVariable("productId") int productId, @RequestBody Product prod)
	{
		if(ps.ExistProduct(productId))
		{
			Product product = ps.saveProduct(prod);
			return new ResponseEntity<Product>(product, HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<Product>(HttpStatus.NO_CONTENT);
			
		}
	}
	
	@DeleteMapping(value = "/product/{pid}")
	public ResponseEntity<String> deleteProduct(@PathVariable("pid") int pid)
	{
		ps.deleteProduct(pid);
		return new ResponseEntity<String>(HttpStatus.NO_CONTENT);
	}
	
	
}

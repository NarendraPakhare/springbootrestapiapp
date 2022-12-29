package com.infy.springbootrestapicrudapp.app.service;

import com.infy.springbootrestapicrudapp.app.model.Product;

public interface ProductService {

	public Product saveProduct(Product p);

	public Iterable<Product> getProduct();

	public void deleteProduct(int pid);

}

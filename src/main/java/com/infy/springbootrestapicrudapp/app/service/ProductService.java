package com.infy.springbootrestapicrudapp.app.service;

import com.infy.springbootrestapicrudapp.app.model.Product;

public interface ProductService {

	public Product saveProduct(Product product);

	public Iterable<Product> getProduct();

	public void deleteProduct(int productId);

	public boolean ExistProduct(int productId);

}

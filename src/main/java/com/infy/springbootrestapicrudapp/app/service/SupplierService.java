package com.infy.springbootrestapicrudapp.app.service;

import com.infy.springbootrestapicrudapp.app.model.Supplier;

public interface SupplierService 
{
	public Supplier saveSupplier(Supplier sup);
	
	public Iterable<Supplier> getSupplier();
	
	public Supplier getSingleSupplier(int supplierId);
}

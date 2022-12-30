package com.infy.springbootrestapicrudapp.app.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.springbootrestapicrudapp.app.model.Supplier;
import com.infy.springbootrestapicrudapp.app.repository.SupplierRepository;
import com.infy.springbootrestapicrudapp.app.service.SupplierService;

@Service
public class SupplierServiceImpl implements SupplierService
{
	@Autowired
	SupplierRepository sr;
	
	public Supplier saveSupplier(Supplier sup)
	{
		return sr.save(sup);
	}
	
	public Iterable<Supplier> getSupplier()
	{
		return sr.findAll();
	}
	
	public Supplier getSingleSupplier(int supplierId)
	{
		return sr.findBySupplierId(supplierId);
	}
}

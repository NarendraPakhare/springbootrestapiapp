package com.infy.springbootrestapicrudapp.app.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.springbootrestapicrudapp.app.exception.findByIdException;
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
		Optional<Supplier> os = sr.findById(supplierId);
		if(os.isPresent())
		{
			return os.get();
		}
		else 
		{
			throw new findByIdException("No Supplier with the ID...");
		}
		
	}
}

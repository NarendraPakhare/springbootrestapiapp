package com.infy.springbootrestapicrudapp.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.springbootrestapicrudapp.app.model.Supplier;
import com.infy.springbootrestapicrudapp.app.service.SupplierService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class SupplierController 
{
	@Autowired
	SupplierService ss;
	
	@PostMapping(value = "/supplier")
	public ResponseEntity<Supplier> saveSupplier(@RequestBody Supplier sup)
	{
		Supplier supplier = ss.saveSupplier(sup);
		return new ResponseEntity<Supplier>(supplier, HttpStatus.CREATED);
	}
	
	@GetMapping(value = "/supplier")
	public ResponseEntity<Iterable<Supplier>> getSuppliers()
	{
		Iterable<Supplier> suppliers = ss.getSupplier();
		return new ResponseEntity<Iterable<Supplier>>(suppliers, HttpStatus.OK);
	}
	
	@GetMapping(value = "/supplier/{id}")
	public ResponseEntity<Supplier> getSingleSupplier(@PathVariable("id") int id)
	{
		Supplier supplier = ss.getSingleSupplier(id);
		
		return new ResponseEntity<Supplier>(supplier,HttpStatus.OK);
	}
	
	@PutMapping(value = "/supplier/{id}")
	public ResponseEntity<Supplier> updateSupplier(@PathVariable("id") int id, @RequestBody Supplier sup)
	{
		ss.getSingleSupplier(id);
		ss.saveSupplier(sup);
		return new ResponseEntity<Supplier>(sup,HttpStatus.OK);
	}
}

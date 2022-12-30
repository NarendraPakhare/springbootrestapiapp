package com.infy.springbootrestapicrudapp.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	@PostMapping("/supplier")
	public ResponseEntity<Supplier> saveSupplier(@RequestBody Supplier sup)
	{
		Supplier supplier = ss.saveSupplier(sup);
		return new ResponseEntity<Supplier>(supplier, HttpStatus.CREATED);
	}
	
	@GetMapping("/supplier")
	public ResponseEntity<Iterable<Supplier>> getSuppliers()
	{
		Iterable<Supplier> suppliers = ss.getSupplier();
		return new ResponseEntity<Iterable<Supplier>>(suppliers, HttpStatus.OK);
	}
}

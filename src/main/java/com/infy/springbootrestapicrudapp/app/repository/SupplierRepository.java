package com.infy.springbootrestapicrudapp.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infy.springbootrestapicrudapp.app.model.Supplier;
@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Integer>
{
	public Supplier findBySupplierId(int supplierId);
}

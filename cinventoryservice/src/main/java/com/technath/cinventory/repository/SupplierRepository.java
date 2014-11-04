package com.technath.cinventory.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.technath.cinventory.model.Supplier;
public interface SupplierRepository extends JpaRepository<Supplier,String>{
	

}

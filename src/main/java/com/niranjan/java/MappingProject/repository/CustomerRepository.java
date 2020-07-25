package com.niranjan.java.MappingProject.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.niranjan.java.MappingProject.dto.OrderResponse;
import com.niranjan.java.MappingProject.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
/*
 * Jpa querys
 * 	This is how we write join query spring data jpa 
 */
	
	@Query("SELECT new com.niranjan.java.MappingProject.dto.OrderResponse( c.name, p.productName) from Customer c JOIN c.products p")
	public List<OrderResponse> getJoinInformation();
}

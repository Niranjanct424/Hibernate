package com.niranjan.java.MappingProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.niranjan.java.MappingProject.dto.OrderRequest;
import com.niranjan.java.MappingProject.dto.OrderResponse;
import com.niranjan.java.MappingProject.entity.Customer;
import com.niranjan.java.MappingProject.repository.CustomerRepository;
import com.niranjan.java.MappingProject.repository.ProductRepository;

@RestController
public class OrderController {
	
	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private ProductRepository productRepository;
	
	@PostMapping("/placrOrder")
	public Customer placeOrder(@RequestBody OrderRequest orderRequest)
	{
		return customerRepository.save(orderRequest.getCustomer());
	}
	
	@GetMapping("/findAllOrders")
	public List<Customer> findAllOrders()
	{
		return customerRepository.findAll();
	}
	
	@GetMapping("/findinfo")
	public List<OrderResponse> getJoinInformation()
	{
		return customerRepository.getJoinInformation();
	}
	
	
/*
 * {
    "customer":{
        "name":"Niranjan",
        "email":"niranjangyadav124@gmail.com",
        "gender":"male",
        "products" : [
           {
                "pid":201,
            "productName":"Mobile",
            "price":7000,
            "qty": 1
           },
            {
            "pid":202,
            "productName":"Laptop",
            "price":61000,
            "qty": 2
           }

        ]
    }
}
 */
	
}

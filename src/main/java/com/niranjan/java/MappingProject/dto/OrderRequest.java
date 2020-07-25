package com.niranjan.java.MappingProject.dto;

import com.niranjan.java.MappingProject.entity.Customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderRequest {
	
	private Customer customer;
}

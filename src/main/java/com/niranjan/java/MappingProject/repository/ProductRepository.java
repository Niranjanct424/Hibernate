package com.niranjan.java.MappingProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.niranjan.java.MappingProject.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}

package com.example.projectjpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projectjpa.entities.Product;
import com.example.projectjpa.repositories.ProductRepository;

@Service
public class ProductService
{
	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll()
	{
		return repository.findAll();
	}
	
	public Product findById(Long id)
	{
		return repository.findById(id).get();
	}
}

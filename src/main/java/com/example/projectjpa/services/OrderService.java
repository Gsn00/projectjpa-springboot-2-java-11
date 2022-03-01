package com.example.projectjpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projectjpa.entities.Order;
import com.example.projectjpa.repositories.OrderRepository;

@Service
public class OrderService
{
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll()
	{
		return repository.findAll();
	}
	
	public Order findById(Long id)
	{
		return repository.findById(id).get();
	}
}

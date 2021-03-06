package com.example.projectjpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projectjpa.entities.User;
import com.example.projectjpa.repositories.UserRepository;

@Service
public class UserService
{
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll()
	{
		return repository.findAll();
	}
	
	public User findById(Long id)
	{
		return repository.findById(id).get();
	}
}

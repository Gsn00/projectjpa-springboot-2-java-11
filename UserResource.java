package com.example.projectjpa.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projectjpa.entities.User;
import com.example.projectjpa.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource
{
	@Autowired
	private UserService service;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll()
	{
		return ResponseEntity.ok().body(service.findAll());
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id)
	{
		return ResponseEntity.ok().body(service.findById(id));
	}
}

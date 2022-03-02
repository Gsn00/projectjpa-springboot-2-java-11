package com.example.projectjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projectjpa.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>
{

}

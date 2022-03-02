package com.example.projectjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projectjpa.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>
{

}

package com.example.projectjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projectjpa.entities.User;

public interface UserRepository extends JpaRepository<User, Long>
{

}

package com.example.projectjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projectjpa.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>
{

}

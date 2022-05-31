package com.lucasrc.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasrc.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}

package com.lucasrc.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasrc.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

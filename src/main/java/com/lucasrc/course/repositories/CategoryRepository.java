package com.lucasrc.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasrc.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}

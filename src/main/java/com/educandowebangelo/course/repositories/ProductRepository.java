package com.educandowebangelo.course.repositories;

import com.educandowebangelo.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

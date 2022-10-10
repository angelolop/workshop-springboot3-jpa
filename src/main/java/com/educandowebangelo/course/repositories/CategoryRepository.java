package com.educandowebangelo.course.repositories;

import com.educandowebangelo.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}

package com.educandowebangelo.course.services;

import com.educandowebangelo.course.entities.Category;
import com.educandowebangelo.course.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

   @Autowired
   private CategoryRepository repository;

   public List<Category> findAll() {
      return repository.findAll();
   }

   public Category findById(Long Id) {
      Optional<Category> obj = repository.findById(Id);
      return obj.get();
   }
}
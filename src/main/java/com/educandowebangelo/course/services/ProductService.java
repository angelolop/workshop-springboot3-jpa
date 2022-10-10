package com.educandowebangelo.course.services;

import com.educandowebangelo.course.entities.Product;
import com.educandowebangelo.course.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

   @Autowired
   private ProductRepository repository;

   public List<Product> findAll() {
      return repository.findAll();
   }

   public Product findById(Long id){
      Optional<Product> product = repository.findById(id);
      return product.get();
   }
}

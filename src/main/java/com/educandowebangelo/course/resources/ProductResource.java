package com.educandowebangelo.course.resources;

import com.educandowebangelo.course.entities.Product;
import com.educandowebangelo.course.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

   @Autowired
   ProductService productService;

   @GetMapping
   private ResponseEntity<List<Product>> findAll() {
      List<Product> products = productService.findAll();
      return ResponseEntity.ok().body(products);
   }

   @GetMapping(value = "/{id}")
   private ResponseEntity<Product> findById(@PathVariable Long id) {
      Product product = productService.findById(id);
      return ResponseEntity.ok().body(product);
   }
}

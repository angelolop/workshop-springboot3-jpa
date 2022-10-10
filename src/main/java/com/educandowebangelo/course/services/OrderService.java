package com.educandowebangelo.course.services;

import com.educandowebangelo.course.entities.Order;
import com.educandowebangelo.course.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

   @Autowired
   private OrderRepository repository;

   public List<Order> findAll() {
      return repository.findAll();
   }

   public Order findById(Long Id) {
      Optional<Order> obj = repository.findById(Id);
      return obj.get();
   }

}

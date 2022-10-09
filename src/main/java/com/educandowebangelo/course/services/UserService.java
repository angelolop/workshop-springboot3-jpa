package com.educandowebangelo.course.services;

import com.educandowebangelo.course.entities.User;
import com.educandowebangelo.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

   @Autowired
   private UserRepository repository;

   public List<User> findAll() {
      return repository.findAll();
   }

   public User findById(Long Id) {
      Optional<User> obj = repository.findById(Id);
      return obj.get();
   }

}

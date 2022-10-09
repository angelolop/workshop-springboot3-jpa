package com.educandowebangelo.course.repositories;

import com.educandowebangelo.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

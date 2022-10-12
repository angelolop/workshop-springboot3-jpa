package com.educandowebangelo.course.repositories;

import com.educandowebangelo.course.entities.OrderItem;
import com.educandowebangelo.course.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}

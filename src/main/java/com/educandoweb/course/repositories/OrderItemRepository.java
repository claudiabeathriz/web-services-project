package com.educandoweb.course.repositories;

import com.educandoweb.course.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

// communication with database
// uses JPA
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
// Spring creates the implementation automatically
}

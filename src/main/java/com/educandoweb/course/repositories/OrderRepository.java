package com.educandoweb.course.repositories;

import com.educandoweb.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

// communication with database
// uses JPA
public interface OrderRepository extends JpaRepository<Order, Long> {
// Spring creates the implementation automatically
}

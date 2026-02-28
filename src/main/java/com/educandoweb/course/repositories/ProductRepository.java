package com.educandoweb.course.repositories;

import com.educandoweb.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

// communication with database
// uses JPA
public interface ProductRepository extends JpaRepository<Product, Long> {
// Spring creates the implementation automatically
}

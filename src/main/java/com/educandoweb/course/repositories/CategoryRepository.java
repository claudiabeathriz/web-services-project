package com.educandoweb.course.repositories;

import com.educandoweb.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

// communication with database
// uses JPA
public interface CategoryRepository extends JpaRepository<Category, Long> {
// Spring creates the implementation automatically
}

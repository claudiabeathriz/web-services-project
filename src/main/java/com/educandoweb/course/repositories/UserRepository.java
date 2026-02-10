package com.educandoweb.course.repositories;

import com.educandoweb.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

// communication with database
// uses JPA
public interface UserRepository extends JpaRepository<User, Long> {
// Spring creates the implementation automatically
}

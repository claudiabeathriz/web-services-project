package com.educandoweb.course.resources;

import com.educandoweb.course.entities.User;
import jakarta.annotation.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// explain what is restcontroller
@RequestMapping(value="/users")
// explain what is requestmapping

public class UserResource {

    // endpoint to access users
    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Maria", "maria@email.com", "90808-0808", "senhaDaMaria");
        return ResponseEntity.ok().body(u);
        // explain each part of the above
    }
}

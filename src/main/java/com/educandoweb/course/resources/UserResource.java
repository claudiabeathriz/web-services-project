package com.educandoweb.course.resources;
// resource layer (rest controllers)

import com.educandoweb.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// a specialized annotation used to build RESTful web services
@RequestMapping(value="/users")
// sets a base URL for all endpoints in this class

public class UserResource {

    // endpoint to access users
    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Maria", "maria@email.com", "90808-0808", "senhaDaMaria");
        return ResponseEntity.ok().body(u);
        // explain the above
    }
}

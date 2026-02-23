package com.educandoweb.course.resources;
// resource layer (rest controllers)

import com.educandoweb.course.entities.User;
import com.educandoweb.course.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
// a specialized annotation used to build RESTful web services
@RequestMapping(value="/users")
// sets a base URL for all endpoints in this class

public class UserResource {

    @Autowired
    private UserService service;
    // endpoint to access users

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        List<User> list = service.findAll();
        return ResponseEntity.ok().body(list);
        // explain the above
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById (@PathVariable Long id){
        User obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}

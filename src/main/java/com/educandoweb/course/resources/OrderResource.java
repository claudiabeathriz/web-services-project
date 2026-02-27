package com.educandoweb.course.resources;
// resource layer (rest controllers)

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
// a specialized annotation used to build RESTful web services
@RequestMapping(value="/orders")
// sets a base URL for all endpoints in this class

public class OrderResource {

    @Autowired
    private OrderService service;
    // endpoint to access Orders

    @GetMapping
    public ResponseEntity<List<Order>> findAll(){
        List<Order> list = service.findAll();
        return ResponseEntity.ok().body(list);
        // explain the above
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Order> findById (@PathVariable Long id){
        Order obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}

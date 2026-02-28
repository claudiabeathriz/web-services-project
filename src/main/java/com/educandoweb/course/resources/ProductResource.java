package com.educandoweb.course.resources;
// resource layer (rest controllers)

import com.educandoweb.course.entities.Product;
import com.educandoweb.course.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
// a specialized annotation used to build RESTful web services
@RequestMapping(value="/products")
// sets a base URL for all endpoints in this class

public class ProductResource {

    @Autowired
    private ProductService service;
    // endpoint to access Orders

    @GetMapping
    public ResponseEntity<List<Product>> findAll(){
        List<Product> list = service.findAll();
        return ResponseEntity.ok().body(list);
        // explain the above
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findById (@PathVariable Long id){
        Product obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}

package com.educandoweb.course.services;

import com.educandoweb.course.entities.Product;
import com.educandoweb.course.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// @Component
// registra como componente a ser injetado automaticamente com Autowired
@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;
    // injeção de dependência do repository

    public List<Product> findAll(){
        return repository.findAll();
    }

    public Product findById(Long id){
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }
}

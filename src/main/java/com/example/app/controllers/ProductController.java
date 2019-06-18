package com.example.app.controllers;

import com.example.app.models.Post;
import com.example.app.models.Product;
import com.example.app.models.User;
import com.example.app.models.Wall;
import com.example.app.repositories.PostRepository;
import com.example.app.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductRepository productRepository;

    @CrossOrigin
    @PostMapping("/product")
    public ResponseEntity<Object> createUser(@RequestBody Product product) {

        Product save = this.productRepository.save(product);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(save.getId()).toUri();

        return ResponseEntity.created(location).build();

    }

    @CrossOrigin
    @GetMapping("/product")
    public List<Product> retrieveAllUsers() {
        List<Product> products = this.productRepository.findAll();

        return products;
    }
}

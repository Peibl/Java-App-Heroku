package com.example.app.controllers;

import com.example.app.models.Post;
import com.example.app.models.Product;
import com.example.app.models.Wall;
import com.example.app.repositories.PostRepository;
import com.example.app.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

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
}

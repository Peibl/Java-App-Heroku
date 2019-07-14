package com.example.app.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
@RestController
public class FormController {

    @CrossOrigin
    @GetMapping("/forms")
    public List<Object> getForms(HttpServletResponse response) {
        return new ArrayList<>();
    }
}

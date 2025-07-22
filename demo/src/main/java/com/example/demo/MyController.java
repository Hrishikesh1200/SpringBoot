package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/authors")
    public String getAuthors(@RequestParam String name) {
        // You can do something with the 'name' parameter if you want
        return "Author API: " + name;
    }

    @GetMapping("/authors/{id}")
    public String getAuthors(@PathVariable  int id) {
        // You can do something with the 'name' parameter if you want
        return "Author API: " + id;
    }

}

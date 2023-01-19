package com.exercicio.cars_api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BuilderController {
    
    @PostMapping("/post")
    public String create(@RequestBody String req) {
        System.out.println(req);
        return req;
    }
}

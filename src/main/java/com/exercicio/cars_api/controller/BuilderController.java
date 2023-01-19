package com.exercicio.cars_api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exercicio.cars_api.dto.CarDTO;

@RestController
@RequestMapping("/api")
public class BuilderController {
    
    @PostMapping("/post")
    public CarDTO create(@RequestBody CarDTO req) {
        System.out.println(req);
        return req;
    }
}

package com.exercicio.cars_api.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.exercicio.cars_api.dto.CarDTO;
import com.exercicio.cars_api.model.CarModel;
import com.exercicio.cars_api.repository.CarRepository;

@RestController
@RequestMapping("/api")
public class BuilderController {

    @Autowired
    private CarRepository repository;

    @GetMapping(value = {"", "/", "/post"})
    public ResponseEntity<List<CarModel>> findAll() {
        return ResponseEntity.status(HttpStatusCode.valueOf(202)).body(repository.findAll());
    }
    
    @PostMapping("/post")
    public void create(@RequestBody CarDTO req)  {
        repository.save(new CarModel(req));
    }
}
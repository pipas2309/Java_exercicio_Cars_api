package com.exercicio.cars_api.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exercicio.cars_api.dto.CarDTO;
import com.exercicio.cars_api.model.CarModel;

@RestController
@RequestMapping("/api")
public class BuilderController {

    private CarModel car = new CarModel();
    
    @PostMapping("/post")
    public CarModel create(@RequestBody CarDTO req) {
        BeanUtils.copyProperties(req, car);

        if(req.modelo() == null) {
            car.setModelo("Carro");
        }
        if(req.fabricante() == null) {
            car.setFabricante("Criado através de geração espontânea");
        }
        if(req.dataFabricacao() == null) {
            car.setDataFabricacao("Sempre/Exis/tiu");
        }
        if(req.anoModelo() == 0) {
            car.setAnoModelo(666);
        }

        System.out.println(car);
        return car;
    }
}

package com.exercicio.cars_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exercicio.cars_api.model.CarModel;

public interface CarRepository extends JpaRepository<CarModel, Long>{
    
}

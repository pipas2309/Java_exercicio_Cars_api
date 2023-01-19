package com.exercicio.cars_api.model;

import com.exercicio.cars_api.dto.CarDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
public class CarModel {

    public CarModel(CarDTO car) {
        this.modelo = car.modelo();
        this.fabricante = car.fabricante();
        this.dataFabricacao = car.dataFabricacao();
        this.valor = car.valor();
        this.anoModelo = car.anoModelo();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 200, nullable = false)
    private String modelo;
    
    @Column(length = 200, nullable = false)
    private String fabricante;
    
    @Column(length = 30, nullable = false)
    private String dataFabricacao;
    
    @Column(length = 10, nullable = false)
    private double valor;
    
    @Column(length = 4, nullable = false)
    private int anoModelo;
}

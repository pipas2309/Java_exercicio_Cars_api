package com.exercicio.cars_api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CarModel {
    private String modelo;
    private String fabricante;
    private String dataFabricacao;
    private double valor;
    private int anoModelo;
}

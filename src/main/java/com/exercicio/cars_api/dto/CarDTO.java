package com.exercicio.cars_api.dto;

import java.time.Year;
import java.util.Date;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Positive;

public record CarDTO(

        @NotBlank String modelo,

        @NotBlank String fabricante,

        @NotNull @Past Date dataFabricacao,

        @NotNull @Positive double valor,

        @NotNull @PastOrPresent Year anoModelo) {
}

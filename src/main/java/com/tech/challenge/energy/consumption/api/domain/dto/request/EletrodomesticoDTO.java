package com.tech.challenge.energy.consumption.api.domain.dto.request;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class EletrodomesticoDTO {

    @NotNull(message = "nome should not be null")
    @NotEmpty(message = "nome should not be null")
    private String nome;
    @NotNull(message = "modelo should not be null")
    @NotEmpty(message = "modelo should not be null")
    private String modelo;
    @NotNull(message = "potencia should not be null")
    private Integer potencia;
    @NotNull(message = "horasUsoDia should not be null")
    private Integer horasUsoDia;
}

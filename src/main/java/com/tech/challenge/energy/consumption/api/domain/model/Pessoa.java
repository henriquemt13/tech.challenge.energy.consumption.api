package com.tech.challenge.energy.consumption.api.domain.model;

import com.tech.challenge.energy.consumption.api.enums.GeneroEnum;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.time.OffsetDateTime;

@Data
@AllArgsConstructor
@Entity
@Table(name = "energy_consumption.pessoa")
public class Pessoa {
    @Id
    @SequenceGenerator(name = "energy_consumption.pessoa_seq",
            sequenceName = "energy_consumption.pessoa_seq", allocationSize = 1)
    @GeneratedValue(generator = "energy_consumption.pessoa_seq")
    @Column(name = "id", unique = true)
    @NotNull(message = "id should not be null")
    private Long id;
    @NotNull(message = "nome should not be null")
    @NotEmpty(message = "nome should not be empty")
    @Column(name = "nome")
    private String nome;
    @NotNull(message = "dataNascimento should not be null")
    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;
    @NotNull(message = "generoEnum should not be null")
    @Column(name = "pessoa_genero")
    private GeneroEnum generoEnum;
    @Column(name = "id_parente")
    private Long parenteId;
    @Column(name = "id_endereco")
    private Long enderecoId;
    @NotNull(message = "parentescoComUsuario should not be null")
    @NotEmpty(message = "parentescoComUsuario should not be empty")
    @Column(name = "parentesco_com_usuario")
    private String parentescoComUsuario;
    @NotNull(message = "Please enter createdAt")
    @Column(name = "created_at")
    private OffsetDateTime createdAt;
    @NotNull(message = "Please enter createdBy")
    @NotBlank(message = "Please enter createdBy")
    @Column(name = "created_by")
    private String createdBy;
    @Column(name = "updated_at")
    private OffsetDateTime updatedAt;
    @Column(name = "updated_by")
    private String updatedBy;
}

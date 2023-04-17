package com.eeep.clinic.domain.models;

import com.eeep.clinic.domain.enums.Sexo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY)
@JsonSubTypes({
        @JsonSubTypes.Type(value = Secretaria.class, name = "Secretaria"),
        @JsonSubTypes.Type(value = Paciente.class, name = "Paciente"),
        @JsonSubTypes.Type(value = Medico.class, name = "Medico")
})
public abstract class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String cpf;

    private String cidade;

    private String bairro;

    private String estado;

    private String telefone;

    @Enumerated(EnumType.STRING)
    private Sexo sexo;
}

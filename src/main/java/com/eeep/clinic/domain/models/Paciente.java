package com.eeep.clinic.domain.models;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Paciente extends Usuario {

    private String nomeUsuario;

    private String email;

    private String convenio;

    private String ficha;

    private String senha;
}

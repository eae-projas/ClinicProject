package com.eeep.clinic.domain.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Medico extends Usuario {

    private String rg;

    private String crm;

    @OneToOne(cascade = CascadeType.ALL)
    private Paciente paciente;

}

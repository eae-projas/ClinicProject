package com.eeep.clinic.domain.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Secretaria extends Usuario {

    private String rg;

    @ManyToOne(cascade = CascadeType.ALL)
    private Medico medico;
}

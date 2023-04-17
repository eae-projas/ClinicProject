package com.eeep.clinic.repositories;

import com.eeep.clinic.domain.models.Secretaria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecretariaRepository extends JpaRepository<Secretaria, Long> {

}

package com.eeep.clinic.services;

import com.eeep.clinic.domain.models.Secretaria;
import com.eeep.clinic.repositories.SecretariaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SecretariaService {

    @Autowired
    private SecretariaRepository secretariaRepository;

    @Transactional
    public List<Secretaria> getSecretarias() {
        return secretariaRepository.findAll();
    }

    @Transactional
    public Optional<Secretaria> getSecretariaPorId(Long id) {
        return secretariaRepository.findById(id);
    }

    @Transactional
    public Secretaria saveSecretaria(Secretaria secretaria) {
        return secretariaRepository.save(secretaria);
    }

    @Transactional
    public Secretaria updateSecretaria(Secretaria secretaria) {
        return secretariaRepository.save(secretaria);
    }

    @Transactional
    public void deleteSecretaria(Long id) {
        secretariaRepository.deleteById(id);
    }
}

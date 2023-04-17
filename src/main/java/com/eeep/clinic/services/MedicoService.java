package com.eeep.clinic.services;

import com.eeep.clinic.domain.models.Medico;
import com.eeep.clinic.repositories.MedicoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedicoService {

    @Autowired
    private MedicoRepository medicoRepository;

    @Transactional
    public List<Medico> getMedicos() {
        return medicoRepository.findAll();
    }

    @Transactional
    public Optional<Medico> getMedicoPorId(Long id) {
        return medicoRepository.findById(id);
    }

    @Transactional
    public Medico saveMedico(Medico medico) {
        return medicoRepository.save(medico);
    }

    @Transactional
    public Medico updateMedico(Medico medico) {
        return medicoRepository.save(medico);
    }

    @Transactional
    public void deleteMedico(Long id) {
        medicoRepository.deleteById(id);
    }
}

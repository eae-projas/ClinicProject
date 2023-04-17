package com.eeep.clinic.services;

import com.eeep.clinic.domain.models.Paciente;
import com.eeep.clinic.repositories.PacienteRepository;
import com.eeep.clinic.utils.GerarSenha;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository pacienteRepository;

    @Transactional
    public List<Paciente> getPacientes() {
        return pacienteRepository.findAll();
    }

    @Transactional
    public Optional<Paciente> getPacientePorId(Long id) {
        return pacienteRepository.findById(id);
    }

    @Transactional
    public Paciente savePaciente(Paciente paciente) {
        return pacienteRepository.save(paciente);
    }

    @Transactional
    public Paciente updatePaciente(Paciente paciente) {
        return pacienteRepository.save(paciente);
    }

    @Transactional
    public void deletePaciente(Long id) {
        pacienteRepository.deleteById(id);
    }
}

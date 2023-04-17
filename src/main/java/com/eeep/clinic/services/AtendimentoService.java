package com.eeep.clinic.services;

import com.eeep.clinic.domain.models.Atendimento;
import com.eeep.clinic.repositories.AtendimentoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AtendimentoService {

    @Autowired
    private AtendimentoRepository atendimentoRepository;

    @Transactional
    public List<Atendimento> getAtendimentos() {
        return atendimentoRepository.findAll();
    }

    @Transactional
    public Optional<Atendimento> getAtendimentoPorId(Long id) {
        return atendimentoRepository.findById(id);
    }

    @Transactional
    public Atendimento saveAtendimento(Atendimento atendimento) {
        return atendimentoRepository.save(atendimento);
    }

    @Transactional
    public Atendimento updateAtendimento(Atendimento atendimento) {
        return atendimentoRepository.save(atendimento);
    }

    @Transactional
    public void deleteAtendimento(Long id) {
        atendimentoRepository.deleteById(id);
    }
}

package com.eeep.clinic.controllers;

import com.eeep.clinic.domain.models.Atendimento;
import com.eeep.clinic.services.AtendimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/atendimentos/")
public class AtendimentoController {

    @Autowired
    private AtendimentoService atendimentoService;

    @GetMapping
    public List<Atendimento> getAtendimentos() {
        return atendimentoService.getAtendimentos();
    }

    @GetMapping("{id}")
    public Optional<Atendimento> getAtendimentoPorId(@PathVariable Long id) {
        return atendimentoService.getAtendimentoPorId(id);
    }

    @PostMapping
    public Atendimento saveAtendimento(@RequestBody Atendimento atendimento) {
        return atendimentoService.saveAtendimento(atendimento);
    }

    @PutMapping
    public Atendimento update(@RequestBody Atendimento atendimento) {
        return atendimentoService.updateAtendimento(atendimento);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        atendimentoService.deleteAtendimento(id);
    }
}

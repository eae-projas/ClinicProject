package com.eeep.clinic.controllers;

import com.eeep.clinic.domain.models.Medico;
import com.eeep.clinic.services.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/medicos/")
public class MedicoController {

    @Autowired
    private MedicoService medicoService;

    @GetMapping
    public List<Medico> getMedicos() {
        return medicoService.getMedicos();
    }

    @GetMapping("{id}")
    public Optional<Medico> getMedicoPorId(@PathVariable Long id) {
        return medicoService.getMedicoPorId(id);
    }

    @PostMapping
    public Medico saveMedico(@RequestBody Medico medico) {
        return medicoService.saveMedico(medico);
    }

    @PutMapping
    public Medico update(@RequestBody Medico medico) {
        return medicoService.updateMedico(medico);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        medicoService.deleteMedico(id);
    }
    
}

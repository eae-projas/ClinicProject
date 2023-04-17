package com.eeep.clinic.controllers;

import com.eeep.clinic.domain.models.Paciente;
import com.eeep.clinic.services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/pacientes/")
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;

    @GetMapping
    public List<Paciente> getPacientes() {
        return pacienteService.getPacientes();
    }

    @GetMapping("{id}")
    public Optional<Paciente> getPacientePorId(@PathVariable Long id) {
        return pacienteService.getPacientePorId(id);
    }

    @GetMapping("/login")
    public String getLoginPage() {
        return "login";
    }

    @PostMapping
    public Paciente savePaciente(@RequestBody Paciente paciente) {
        return pacienteService.savePaciente(paciente);
    }

    @PutMapping
    public Paciente update(@RequestBody Paciente paciente) {
        return pacienteService.updatePaciente(paciente);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        pacienteService.deletePaciente(id);
    }
}

package com.eeep.clinic.controllers;

import com.eeep.clinic.domain.models.Secretaria;
import com.eeep.clinic.services.SecretariaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/secretaria/")
public class SecretariaController {

    @Autowired
    private SecretariaService secretariaService;

    @GetMapping
    public List<Secretaria> getSecretarias() {
        return secretariaService.getSecretarias();
    }

    @GetMapping("{id}")
    public Optional<Secretaria> getSecretariaPorId(@PathVariable Long id) {
        return secretariaService.getSecretariaPorId(id);
    }

    @PostMapping
    public Secretaria saveSecretaria(@RequestBody Secretaria secretaria) {
        return secretariaService.saveSecretaria(secretaria);
    }

    @PutMapping
    public Secretaria update(@RequestBody Secretaria secretaria) {
        return secretariaService.updateSecretaria(secretaria);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        secretariaService.deleteSecretaria(id);
    }
}

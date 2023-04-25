package br.gov.sp.fatec.projetospringestudo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.fatec.projetospringestudo.entity.Persona;
import br.gov.sp.fatec.projetospringestudo.service.IPersonaService;

@RestController
@CrossOrigin
@RequestMapping(value = "/persona")
public class PersonaController {

    @Autowired
    private IPersonaService service;

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public Persona novoPersona(@RequestBody Persona persona) {
        return service.novoPersona(persona);
    }

    @GetMapping
    public List<Persona> buscarTodososPersonas() {
        return service.buscarTodososPersonas();
    }
    
    @GetMapping(value = "/id/{persona}")
    public Persona buscarPorId(@PathVariable("persona") Long id) {
        return service.buscarPorId(id);
    }
}
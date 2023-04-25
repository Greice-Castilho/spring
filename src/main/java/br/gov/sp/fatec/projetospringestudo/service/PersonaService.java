package br.gov.sp.fatec.projetospringestudo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.fatec.projetospringestudo.entity.Persona;
import br.gov.sp.fatec.projetospringestudo.exception.PersonaNaoEncontradoException;
import br.gov.sp.fatec.projetospringestudo.repository.PersonaRepository;

@Service
public class PersonaService implements IPersonaService { 

    @Autowired
    private PersonaRepository personaRepo;

    public Persona novoPersona (Persona persona) {
        if(persona == null 
                || persona.getNome() == null 
                || persona.getClasse() == null) {
            throw new IllegalArgumentException("Nome e classe inválidos!");
        }
        return personaRepo.save(persona);
    }

    public List<Persona> buscarTodososPersonas() {
        return personaRepo.findAll();
    }

    public Persona buscarPorId(Long id) {
        Optional<Persona> personaOp = personaRepo.findById(id);
        if(personaOp.isEmpty()) {
            throw new PersonaNaoEncontradoException("Personagem não existe!");
        }
        return personaOp.get();
    }    
}

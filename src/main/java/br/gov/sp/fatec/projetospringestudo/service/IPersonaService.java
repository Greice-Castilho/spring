package br.gov.sp.fatec.projetospringestudo.service;

import java.util.List;

import br.gov.sp.fatec.projetospringestudo.entity.Persona;


public interface IPersonaService {

        public Persona novoPersona(Persona persona);
    
        public List<Persona> buscarTodososPersonas();
    
        public Persona buscarPorId(Long id);    
    }
    


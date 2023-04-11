package br.gov.sp.fatec.projetospringestudo.service;

import java.util.List;

import br.gov.sp.fatec.projetospringestudo.entity.Trabalho;

public interface ITrabalhoService {

        public Trabalho novoTrabalho(Trabalho trabalho);
    
        public List<Trabalho> buscarTodososTrabalhos();
    
        public Trabalho buscarPorId(Long id);    
    }
    


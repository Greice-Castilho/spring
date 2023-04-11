package br.gov.sp.fatec.projetospringestudo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.fatec.projetospringestudo.entity.Trabalho;
import br.gov.sp.fatec.projetospringestudo.exception.TrabalhoNaoEncontradoException;
import br.gov.sp.fatec.projetospringestudo.repository.TrabalhoRepository;

@Service
public class TrabalhoService implements ITrabalhoService { 

    @Autowired
    private TrabalhoRepository trabalhoRepo;

    public Trabalho novoTrabalho (Trabalho trabalho) {
        if(trabalho == null 
                || trabalho.getTitulo() == null 
                || trabalho.getDescricao() == null) {
            throw new IllegalArgumentException("Titulo e descrição inválidos!");
        }
        return trabalhoRepo.save(trabalho);
    }

    public List<Trabalho> buscarTodososTrabalhos() {
        return trabalhoRepo.findAll();
    }

    public Trabalho buscarPorId(Long id) {
        Optional<Trabalho> trabalhoOp = trabalhoRepo.findById(id);
        if(trabalhoOp.isEmpty()) {
            throw new TrabalhoNaoEncontradoException("Trabalho não existe!");
        }
        return trabalhoOp.get();
    }
    
}

package br.gov.sp.fatec.projetospringestudo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.sp.fatec.projetospringestudo.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    
}

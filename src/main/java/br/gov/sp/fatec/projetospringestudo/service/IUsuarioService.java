package br.gov.sp.fatec.projetospringestudo.service;

import java.util.List;

import br.gov.sp.fatec.projetospringestudo.entity.Usuario;

public interface IUsuarioService {

    public Usuario buscarPorId(Long id);

    public Usuario novoUsuario(Usuario usuario);

    public List<Usuario> buscarTodos();    
}

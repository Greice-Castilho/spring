package br.gov.sp.fatec.projetospringestudo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "usr_usuario")
public class Usuario {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "urs_id")
    private Long id;

    @Column (name = "urs_nome")
    private String nome;

    @Column (name = "urs_senha")
    private String senha;
    
    public Usuario (String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public Usuario () {
        //Faz nada 
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}

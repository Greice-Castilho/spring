package br.gov.sp.fatec.projetospringestudo.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "per_personagem")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "per_id")
    private Long id;

    @Column(name = "per_nome")    
    private String nome;

    @Column(name = "per_classe")
    private String classe;

    @Column(name = "per_data_hora_criacao")
    private LocalDateTime dataHora;

    @Column(name = "per_intelligence")
    private Integer intelligence;

    @Column(name = "per_strength") 
    private Integer strength;

    @Column(name = "per_health")
    private Integer health;

    public Persona () { 
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getClasse() {
        return classe;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public Integer getIntelligence() {
        return intelligence;
    }

    public Integer getStrength() {
        return strength;
    }

    public Integer getHealth() {
        return health;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public void setIntelligence(Integer intelligence) {
        this.intelligence = intelligence;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }    
}

       
        

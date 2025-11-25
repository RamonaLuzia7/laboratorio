package com.senai.backend.gerenciamento_lab.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="laboratorio")

public class Laboratorio {
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   @Column(name="id")
   private Integer id;

   @Column(name="nome")
   private String nome;
  
   @Column(name="localizacao")
   private String localizacao;
  
   @OneToMany(mappedBy = "laboratorio")
    private List<Equipamento> equipamentos;

    public Laboratorio() {
 }
   public Integer getId() {
    return id;
}

   public void setId(Integer id) {
    this.id = id;
   }

   public String getNome() {
    return nome;
   }

   public void setNome(String nome) {
    this.nome = nome;
   }

   public String getLocalizacao() {
    return localizacao;
   }

   public void setLocalizacao(String localizacao) {
    this.localizacao = localizacao;
   }

   public List<Equipamento> getEquipamentos() {
    return equipamentos;
   }

   public void setEquipamentos(List<Equipamento> equipamento) {
    this.equipamentos = equipamento;
   }

   public Laboratorio(Integer id, String nome, String localizacao, List<Equipamento> equipamento) {
    this.id = id;
    this.nome = nome;
    this.localizacao = localizacao;
    this.equipamentos = equipamento;
}


}

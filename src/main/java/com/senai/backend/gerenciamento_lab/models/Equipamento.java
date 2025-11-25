package com.senai.backend.gerenciamento_lab.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="equipamento")

public class Equipamento{
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   @Column(name="id")
   private Integer id;

   @Column(name="nome")
   private String nome;
  
   @Column(name="descricao")
   private String descricao;

  @ManyToOne
  @JoinColumn(name = "id_laboratorio", referencedColumnName = "id")
  private Laboratorio laboratorio;
   
    public Equipamento() {
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

   public String getDescricao() {
    return descricao;
   }

   public void setDescricao(String descricao) {
    this.descricao = descricao;
   }

 public Equipamento(Integer id, String nome, String descricao) {
    this.id = id;
    this.nome = nome;
    this.descricao = descricao;
}

    public Laboratorio getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(Laboratorio laboratorio) {
        this.laboratorio = laboratorio;
    }

}

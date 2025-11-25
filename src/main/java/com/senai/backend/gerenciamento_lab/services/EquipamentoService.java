package com.senai.backend.gerenciamento_lab.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.backend.gerenciamento_lab.models.Equipamento;
import com.senai.backend.gerenciamento_lab.repositories.EquipamentoRepository;

@Service
public class EquipamentoService {

    @Autowired
    private EquipamentoRepository equipamentoRepository;


    public Equipamento cadastrar(Equipamento equipamento) {
        return equipamentoRepository.save(equipamento);
    }

   
    public Equipamento recuperarPorId(Integer id) {
        
        return equipamentoRepository.findById(id).orElse(null);
    }

  
    public List<Equipamento> listarTodos() {
        return equipamentoRepository.findAll();
    }

    public Equipamento atualizar(Integer id, Equipamento equipamento) {
        Optional<Equipamento> eqOpt = equipamentoRepository.findById(id);

        if (eqOpt.isPresent()) {
            Equipamento eq = eqOpt.get();
            equipamento.setId(eq.getId()); // Mantém o mesmo ID
            return equipamentoRepository.save(equipamento);
        }
        return null;
    }

    public boolean removerPorId(Integer id) {
        Equipamento eq = equipamentoRepository.findById(id).orElse(null);
        if (eq != null) {
            equipamentoRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
package com.senai.backend.gerenciamento_lab.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.backend.gerenciamento_lab.models.Laboratorio;
import com.senai.backend.gerenciamento_lab.repositories.LaboratorioRepository;

@Service
public class LaboratorioService {

    @Autowired
    private LaboratorioRepository labRepository;

    public Laboratorio cadastrar(Laboratorio laboratorio) {
        return labRepository.save(laboratorio);
    }

    public Laboratorio recuperarPorId(Integer id) {
        return  labRepository.findById(id).get();
    }

    public List<Laboratorio> listarTodos() {
        return labRepository.findAll();
    }

    public Laboratorio atualizar(Integer id, Laboratorio laboratorio) {
    Optional<Laboratorio> labOpt = labRepository.findById(id);

    if (labOpt.isPresent()) {
        Laboratorio lab = labOpt.get();
        laboratorio.setId(lab.getId());
        return labRepository.save(laboratorio);
    }
    return null;
}
   public boolean removerPorId(Integer id) {
    Laboratorio lab = labRepository.findById(id).orElse(null);
    if (lab != null) {
        labRepository.deleteById(id);
        return true;
    }
    return false;
}
    }
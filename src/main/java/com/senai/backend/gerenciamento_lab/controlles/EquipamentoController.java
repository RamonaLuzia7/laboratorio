package com.senai.backend.gerenciamento_lab.controlles;



import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.backend.gerenciamento_lab.models.Equipamento;
import com.senai.backend.gerenciamento_lab.repositories.EquipamentoRepository;

@RestController
@RequestMapping("/equipamentos")
public class EquipamentoController {

    private final EquipamentoRepository equirepository;

    public EquipamentoController(EquipamentoRepository repository) {
        this.equirepository = repository;
    }

    @PostMapping
    public Equipamento salvar(@RequestBody Equipamento equipamento) {
        return equirepository.save(equipamento);
    }


}
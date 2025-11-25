package com.senai.backend.gerenciamento_lab.controlles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.backend.gerenciamento_lab.models.Equipamento;
import com.senai.backend.gerenciamento_lab.services.EquipamentoService;


@RestController
@RequestMapping("/equipamento")
public class EquipamentoController {

    @Autowired
    private EquipamentoService equipamentoService;

    @PostMapping("/cadastrar")
    public Equipamento cadastrar(@RequestBody Equipamento equipamento) {
        return equipamentoService.cadastrar(equipamento);
    }

    @GetMapping("/recuperar-por-id/{id}")
    public Equipamento recuperarPorId(@PathVariable Integer id) {
        return equipamentoService.recuperarPorId(id);
    }

    @GetMapping("/listar-todos")
    public List<Equipamento> listarTodos() {
        return equipamentoService.listarTodos();
    }

    @PutMapping("/atualizar/{id}")
    public String putMethodName(@PathVariable String id, @RequestBody String entity) {
        return entity;
    }
    public Equipamento atualizar(@PathVariable Integer id, @RequestBody Equipamento equipamento) {
        return equipamentoService.atualizar(id, equipamento);
    }

    @DeleteMapping("/remover/{id}")
    public boolean remover(@PathVariable Integer id) {
        return equipamentoService.removerPorId(id);
    }
}

package com.RedColem.RedColem.com.redcolem.app.usuario.controllers;

import com.RedColem.RedColem.com.redcolem.app.usuario.dtos.UsuariodepartamentoDTO;
import com.RedColem.RedColem.com.redcolem.app.usuario.services.UsuariodepartamentoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuariodepartamentos")
public class UsuariodepartamentoController {

    private final UsuariodepartamentoService service;

    public UsuariodepartamentoController(UsuariodepartamentoService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<UsuariodepartamentoDTO>> getAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsuariodepartamentoDTO> getById(@PathVariable Integer id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @PostMapping
    public ResponseEntity<UsuariodepartamentoDTO> create(@RequestBody UsuariodepartamentoDTO dto) {
        return ResponseEntity.ok(service.save(dto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<UsuariodepartamentoDTO> update(@PathVariable Integer id, @RequestBody UsuariodepartamentoDTO dto) {
        dto.setIdUsuariodepartamento(id);
        return ResponseEntity.ok(service.save(dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}

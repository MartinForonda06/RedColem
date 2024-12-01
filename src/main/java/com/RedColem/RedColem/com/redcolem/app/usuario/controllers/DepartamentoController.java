package com.RedColem.RedColem.com.redcolem.app.usuario.controllers;

import com.RedColem.RedColem.com.redcolem.app.usuario.dtos.DepartamentoDTO;
import com.RedColem.RedColem.com.redcolem.app.usuario.services.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/departamentos")
public class DepartamentoController {

    private final DepartamentoService departamentoService;

    @Autowired
    public DepartamentoController(DepartamentoService departamentoService) {
        this.departamentoService = departamentoService;
    }

    @GetMapping
    public List<DepartamentoDTO> obtenerTodos() {
        return departamentoService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public DepartamentoDTO obtenerPorId(@PathVariable Long id) {
        return departamentoService.obtenerPorId(id);
    }

    @PostMapping
    public DepartamentoDTO crear(@RequestBody DepartamentoDTO departamentoDTO) {
        return departamentoService.crear(departamentoDTO);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        departamentoService.eliminar(id);
    }
}

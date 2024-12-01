package com.RedColem.RedColem.com.redcolem.app.roles.controllers;

import com.RedColem.RedColem.com.redcolem.app.roles.dtos.AdministradorDTO;
import com.RedColem.RedColem.com.redcolem.app.roles.services.AdministradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/administrador")
public class AdministradorController {

    private final AdministradorService administradorService;

    @Autowired
    public AdministradorController(AdministradorService administradorService) {
        this.administradorService = administradorService;
    }

    @GetMapping
    public List<AdministradorDTO> obtenerTodos() {
        return administradorService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public AdministradorDTO obtenerPorId(@PathVariable Long id) {
        return administradorService.obtenerPorId(id);
    }

    @PostMapping
    public AdministradorDTO crear(@RequestBody AdministradorDTO administradorDTO) {
        return administradorService.crear(administradorDTO);
    }

    @PutMapping("/{id}")
    public AdministradorDTO actualizar(@PathVariable Long id, @RequestBody AdministradorDTO administradorDTO) {
        return administradorService.actualizar(id, administradorDTO);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        administradorService.eliminar(id);
    }
}

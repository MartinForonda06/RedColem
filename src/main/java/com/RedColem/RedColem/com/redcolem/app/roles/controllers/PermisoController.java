package com.RedColem.RedColem.com.redcolem.app.roles.controllers;

import com.RedColem.RedColem.com.redcolem.app.roles.dtos.PermisoDTO;
import com.RedColem.RedColem.com.redcolem.app.roles.services.PermisoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/permiso")
public class PermisoController {

    private final PermisoService permisoService;

    @Autowired
    public PermisoController(PermisoService permisoService) {
        this.permisoService = permisoService;
    }

    @GetMapping
    public List<PermisoDTO> obtenerTodos() {
        return permisoService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public PermisoDTO obtenerPorId(@PathVariable Long id) {
        return permisoService.obtenerPorId(id);
    }

    @PostMapping
    public PermisoDTO crear(@RequestBody PermisoDTO permisoDTO) {
        return permisoService.crear(permisoDTO);
    }

    @PutMapping("/{id}")
    public PermisoDTO actualizar(@PathVariable Long id, @RequestBody PermisoDTO permisoDTO) {
        return permisoService.actualizar(id, permisoDTO);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        permisoService.eliminar(id);
    }
}

package com.RedColem.RedColem.app.roles.controllers;

import com.RedColem.RedColem.app.roles.dtos.PermisoMenuDTO;
import com.RedColem.RedColem.app.roles.services.PermisoMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/permisomenu")
public class PermisoMenuController {

    private final PermisoMenuService permisoMenuService;

    @Autowired
    public PermisoMenuController(PermisoMenuService permisoMenuService) {
        this.permisoMenuService = permisoMenuService;
    }

    @GetMapping
    public List<PermisoMenuDTO> obtenerTodos() {
        return permisoMenuService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public PermisoMenuDTO obtenerPorId(@PathVariable Long id) {
        return permisoMenuService.obtenerPorId(id);
    }

    @PostMapping
    public PermisoMenuDTO crear(@RequestBody PermisoMenuDTO permisoMenuDTO) {
        return permisoMenuService.crear(permisoMenuDTO);
    }

    @PutMapping("/{id}")
    public PermisoMenuDTO actualizar(@PathVariable Long id, @RequestBody PermisoMenuDTO permisoMenuDTO) {
        return permisoMenuService.actualizar(id, permisoMenuDTO);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        permisoMenuService.eliminar(id);
    }
}

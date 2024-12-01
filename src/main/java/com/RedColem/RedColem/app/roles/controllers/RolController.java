package com.RedColem.RedColem.app.roles.controllers;

import com.RedColem.RedColem.app.roles.dtos.RolDTO;
import com.RedColem.RedColem.app.roles.services.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/roles")
public class RolController {

    private final RolService rolService;

    @Autowired
    public RolController(RolService rolService) {
        this.rolService = rolService;
    }

    @GetMapping
    public List<RolDTO> obtenerTodos() {
        return rolService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public RolDTO obtenerPorId(@PathVariable Long id) {
        return rolService.obtenerPorId(id);
    }

    @PostMapping
    public RolDTO crear(@RequestBody RolDTO rolDTO) {
        return rolService.crear(rolDTO);
    }

    @PutMapping("/{id}")
    public RolDTO actualizar(@PathVariable Long id, @RequestBody RolDTO rolDTO) {
        return rolService.actualizar(id, rolDTO);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        rolService.eliminar(id);
    }
}

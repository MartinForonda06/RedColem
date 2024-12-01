package com.RedColem.RedColem.app.roles.controllers;

import com.RedColem.RedColem.app.roles.dtos.RolMenuDTO;
import com.RedColem.RedColem.app.roles.services.RolMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rolmenu")
public class RolMenuController {

    private final RolMenuService rolMenuService;

    @Autowired
    public RolMenuController(RolMenuService rolMenuService) {
        this.rolMenuService = rolMenuService;
    }

    @GetMapping
    public List<RolMenuDTO> obtenerTodos() {
        return rolMenuService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public RolMenuDTO obtenerPorId(@PathVariable Long id) {
        return rolMenuService.obtenerPorId(id);
    }

    @PostMapping
    public RolMenuDTO crear(@RequestBody RolMenuDTO rolMenuDTO) {
        return rolMenuService.crear(rolMenuDTO);
    }

    @PutMapping("/{id}")
    public RolMenuDTO actualizar(@PathVariable Long id, @RequestBody RolMenuDTO rolMenuDTO) {
        return rolMenuService.actualizar(id, rolMenuDTO);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        rolMenuService.eliminar(id);
    }
}

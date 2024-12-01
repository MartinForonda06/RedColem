package com.RedColem.RedColem.com.redcolem.app.roles.controllers;

import com.RedColem.RedColem.com.redcolem.app.roles.dtos.RolesusuarioDTO;
import com.RedColem.RedColem.com.redcolem.app.roles.services.RolesusuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rolesusuario")
public class RolesUsuarioController {

    private final RolesusuarioService rolesusuarioService;

    @Autowired
    public RolesUsuarioController(RolesusuarioService rolesusuarioService) {
        this.rolesusuarioService = rolesusuarioService;
    }

    @GetMapping
    public List<RolesusuarioDTO> obtenerTodos() {
        return rolesusuarioService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public RolesusuarioDTO obtenerPorId(@PathVariable Long id) {
        return rolesusuarioService.obtenerPorId(id);
    }

    @PostMapping
    public RolesusuarioDTO crear(@RequestBody RolesusuarioDTO rolesusuarioDTO) {
        return rolesusuarioService.crear(rolesusuarioDTO);
    }

    @PutMapping("/{id}")
    public RolesusuarioDTO actualizar(@PathVariable Long id, @RequestBody RolesusuarioDTO rolesusuarioDTO) {
        return rolesusuarioService.actualizar(id, rolesusuarioDTO);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        rolesusuarioService.eliminar(id);
    }
}

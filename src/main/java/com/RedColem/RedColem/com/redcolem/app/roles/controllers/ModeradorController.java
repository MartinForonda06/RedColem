package com.RedColem.RedColem.com.redcolem.app.roles.controllers;

import com.RedColem.RedColem.com.redcolem.app.roles.dtos.ModeradorDTO;
import com.RedColem.RedColem.com.redcolem.app.roles.services.ModeradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/moderador")
public class ModeradorController {

    private final ModeradorService moderadorService;

    @Autowired
    public ModeradorController(ModeradorService moderadorService) {
        this.moderadorService = moderadorService;
    }

    @GetMapping
    public List<ModeradorDTO> obtenerTodos() {
        return moderadorService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public ModeradorDTO obtenerPorId(@PathVariable Long id) {
        return moderadorService.obtenerPorId(id);
    }

    @PostMapping
    public ModeradorDTO crear(@RequestBody ModeradorDTO moderadorDTO) {
        return moderadorService.crear(moderadorDTO);
    }

    @PutMapping("/{id}")
    public ModeradorDTO actualizar(@PathVariable Long id, @RequestBody ModeradorDTO moderadorDTO) {
        return moderadorService.actualizar(id, moderadorDTO);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        moderadorService.eliminar(id);
    }
}

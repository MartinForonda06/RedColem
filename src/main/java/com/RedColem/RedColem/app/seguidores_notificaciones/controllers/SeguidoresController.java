package com.RedColem.RedColem.app.seguidores_notificaciones.controllers;

import com.RedColem.RedColem.app.seguidores_notificaciones.dtos.SeguimientoDTO;
import com.RedColem.RedColem.app.seguidores_notificaciones.services.SeguidoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/seguidores")
public class SeguidoresController {

    private final SeguidoresService seguidoresService;

    @Autowired
    public SeguidoresController(SeguidoresService seguidoresService) {
        this.seguidoresService = seguidoresService;
    }

    @GetMapping
    public List<SeguimientoDTO> obtenerTodos() {
        return seguidoresService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public SeguimientoDTO obtenerPorId(@PathVariable Long id) {
        return seguidoresService.obtenerPorId(id);
    }

    @PostMapping
    public SeguimientoDTO crear(@RequestBody SeguimientoDTO seguimientoDTO) {
        return seguidoresService.crear(seguimientoDTO);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        seguidoresService.eliminar(id);
    }
}

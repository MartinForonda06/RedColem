package com.RedColem.RedColem.app.seguidores_notificaciones.controllers;

import com.RedColem.RedColem.app.seguidores_notificaciones.dtos.HistorialAccionDTO;
import com.RedColem.RedColem.app.seguidores_notificaciones.services.HistorialAccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/historial")
public class HistorialAccionController {

    private final HistorialAccionService historialAccionService;

    @Autowired
    public HistorialAccionController(HistorialAccionService historialAccionService) {
        this.historialAccionService = historialAccionService;
    }

    @GetMapping
    public List<HistorialAccionDTO> obtenerTodos() {
        return historialAccionService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public HistorialAccionDTO obtenerPorId(@PathVariable Long id) {
        return historialAccionService.obtenerPorId(id);
    }

    @PostMapping
    public HistorialAccionDTO crear(@RequestBody HistorialAccionDTO historialAccionDTO) {
        return historialAccionService.crear(historialAccionDTO);
    }

    @PutMapping("/{id}")
    public HistorialAccionDTO actualizar(@PathVariable Long id, @RequestBody HistorialAccionDTO historialAccionDTO) {
        return historialAccionService.actualizar(id, historialAccionDTO);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        historialAccionService.eliminar(id);
    }
}

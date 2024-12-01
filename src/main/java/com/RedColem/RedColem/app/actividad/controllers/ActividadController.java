package com.RedColem.RedColem.app.actividad.controllers;

import com.RedColem.RedColem.app.actividad.dtos.ActividadDTO;
import com.RedColem.RedColem.app.actividad.services.ActividadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/actividades")
public class ActividadController {

    private final ActividadService actividadService;

    @Autowired
    public ActividadController(ActividadService actividadService) {
        this.actividadService = actividadService;
    }

    @GetMapping
    public List<ActividadDTO> obtenerTodas() {
        return actividadService.obtenerTodas();
    }

    @GetMapping("/{id}")
    public ActividadDTO obtenerPorId(@PathVariable Long id) {
        return actividadService.obtenerPorId(id);
    }

    @PostMapping
    public ActividadDTO crear(@RequestBody ActividadDTO actividadDTO) {
        return actividadService.crear(actividadDTO);
    }

    @PutMapping("/{id}")
    public ActividadDTO actualizar(@PathVariable Long id, @RequestBody ActividadDTO actividadDTO) {
        return actividadService.actualizar(id, actividadDTO);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        actividadService.eliminar(id);
    }
}

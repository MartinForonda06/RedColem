package com.RedColem.RedColem.app.actividad.controllers;

import com.RedColem.RedColem.app.actividad.dtos.InnovacionDTO;
import com.RedColem.RedColem.app.actividad.services.InnovacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/innovaciones")
public class InnovacionController {

    private final InnovacionService innovacionService;

    @Autowired
    public InnovacionController(InnovacionService innovacionService) {
        this.innovacionService = innovacionService;
    }

    @GetMapping
    public List<InnovacionDTO> obtenerTodas() {
        return innovacionService.obtenerTodas();
    }

    @GetMapping("/{id}")
    public InnovacionDTO obtenerPorId(@PathVariable Long id) {
        return innovacionService.obtenerPorId(id);
    }

    @PostMapping
    public InnovacionDTO crear(@RequestBody InnovacionDTO innovacionDTO) {
        return innovacionService.crear(innovacionDTO);
    }

    @PutMapping("/{id}")
    public InnovacionDTO actualizar(@PathVariable Long id, @RequestBody InnovacionDTO innovacionDTO) {
        return innovacionService.actualizar(id, innovacionDTO);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        innovacionService.eliminar(id);
    }
}

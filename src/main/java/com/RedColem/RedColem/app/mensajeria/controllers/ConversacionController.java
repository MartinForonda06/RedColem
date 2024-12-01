package com.RedColem.RedColem.app.mensajeria.controllers;

import com.RedColem.RedColem.app.mensajeria.dtos.ConversacionDTO;
import com.RedColem.RedColem.app.mensajeria.services.ConversacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/conversacion")
public class ConversacionController {

    private final ConversacionService conversacionService;

    @Autowired
    public ConversacionController(ConversacionService conversacionService) {
        this.conversacionService = conversacionService;
    }

    @GetMapping
    public List<ConversacionDTO> obtenerTodas() {
        return conversacionService.obtenerTodas();
    }

    @GetMapping("/{id}")
    public ConversacionDTO obtenerPorId(@PathVariable Long id) {
        return conversacionService.obtenerPorId(id);
    }

    @PostMapping
    public ConversacionDTO crear(@RequestBody ConversacionDTO conversacionDTO) {
        return conversacionService.crear(conversacionDTO);
    }

    @PutMapping("/{id}")
    public ConversacionDTO actualizar(@PathVariable Long id, @RequestBody ConversacionDTO conversacionDTO) {
        return conversacionService.actualizar(id, conversacionDTO);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        conversacionService.eliminar(id);
    }
}

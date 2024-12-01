package com.RedColem.RedColem.com.redcolem.app.mensajeria.controllers;

import com.RedColem.RedColem.com.redcolem.app.mensajeria.dtos.MensajeDTO;
import com.RedColem.RedColem.com.redcolem.app.mensajeria.services.MensajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mensaje")
public class MensajeController {

    private final MensajeService mensajeService;

    @Autowired
    public MensajeController(MensajeService mensajeService) {
        this.mensajeService = mensajeService;
    }

    @GetMapping
    public List<MensajeDTO> obtenerTodos() {
        return mensajeService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public MensajeDTO obtenerPorId(@PathVariable Long id) {
        return mensajeService.obtenerPorId(id);
    }

    @PostMapping
    public MensajeDTO crear(@RequestBody MensajeDTO mensajeDTO) {
        return mensajeService.crear(mensajeDTO);
    }

    @PutMapping("/{id}")
    public MensajeDTO actualizar(@PathVariable Long id, @RequestBody MensajeDTO mensajeDTO) {
        return mensajeService.actualizar(id, mensajeDTO);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        mensajeService.eliminar(id);
    }
}

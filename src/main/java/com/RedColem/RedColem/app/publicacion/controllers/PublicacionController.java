package com.RedColem.RedColem.app.publicacion.controllers;

import com.RedColem.RedColem.app.publicacion.dtos.PublicacionDTO;
import com.RedColem.RedColem.app.publicacion.services.PublicacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/publicacion")
public class PublicacionController {

    private final PublicacionService publicacionService;

    @Autowired
    public PublicacionController(PublicacionService publicacionService) {
        this.publicacionService = publicacionService;
    }

    @GetMapping
    public List<PublicacionDTO> obtenerTodos() {
        return publicacionService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public PublicacionDTO obtenerPorId(@PathVariable Long id) {
        return publicacionService.obtenerPorId(id);
    }

    @PostMapping
    public PublicacionDTO crear(@RequestBody PublicacionDTO publicacionDTO) {
        return publicacionService.crear(publicacionDTO);
    }

    @PutMapping("/{id}")
    public PublicacionDTO actualizar(@PathVariable Long id, @RequestBody PublicacionDTO publicacionDTO) {
        return publicacionService.actualizar(id, publicacionDTO);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        publicacionService.eliminar(id);
    }
}

package com.RedColem.RedColem.com.redcolem.app.comentario_reacciones.controllers;

import com.RedColem.RedColem.com.redcolem.app.comentario_reacciones.dtos.ComentariosDTO;
import com.RedColem.RedColem.com.redcolem.app.comentario_reacciones.services.ComentariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comentarios")
public class ComentariosController {

    private final ComentariosService comentariosService;

    @Autowired
    public ComentariosController(ComentariosService comentariosService) {
        this.comentariosService = comentariosService;
    }

    @GetMapping
    public List<ComentariosDTO> obtenerTodos() {
        return comentariosService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public ComentariosDTO obtenerPorId(@PathVariable Long id) {
        return comentariosService.obtenerPorId(id);
    }

    @PostMapping
    public ComentariosDTO crear(@RequestBody ComentariosDTO comentariosDTO) {
        return comentariosService.crear(comentariosDTO);
    }

    @PutMapping("/{id}")
    public ComentariosDTO actualizar(@PathVariable Long id, @RequestBody ComentariosDTO comentariosDTO) {
        return comentariosService.actualizar(id, comentariosDTO);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        comentariosService.eliminar(id);
    }
}

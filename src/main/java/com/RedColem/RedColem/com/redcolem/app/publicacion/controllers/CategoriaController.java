package com.RedColem.RedColem.com.redcolem.app.publicacion.controllers;

import com.RedColem.RedColem.com.redcolem.app.publicacion.dtos.CategoriaDTO;
import com.RedColem.RedColem.com.redcolem.app.publicacion.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categoria")
public class CategoriaController {

    private final CategoriaService categoriaService;

    @Autowired
    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @GetMapping
    public List<CategoriaDTO> obtenerTodos() {
        return categoriaService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public CategoriaDTO obtenerPorId(@PathVariable Long id) {
        return categoriaService.obtenerPorId(id);
    }

    @PostMapping
    public CategoriaDTO crear(@RequestBody CategoriaDTO categoriaDTO) {
        return categoriaService.crear(categoriaDTO);
    }

    @PutMapping("/{id}")
    public CategoriaDTO actualizar(@PathVariable Long id, @RequestBody CategoriaDTO categoriaDTO) {
        return categoriaService.actualizar(id, categoriaDTO);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        categoriaService.eliminar(id);
    }
}

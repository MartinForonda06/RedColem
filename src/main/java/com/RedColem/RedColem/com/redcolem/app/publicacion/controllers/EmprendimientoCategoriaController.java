package com.RedColem.RedColem.com.redcolem.app.publicacion.controllers;

import com.RedColem.RedColem.com.redcolem.app.publicacion.dtos.EmprendimientoCategoriaDTO;
import com.RedColem.RedColem.com.redcolem.app.publicacion.services.EmprendimientoCategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/emprendimiento-categoria")
public class EmprendimientoCategoriaController {

    private final EmprendimientoCategoriaService emprendimientoCategoriaService;

    @Autowired
    public EmprendimientoCategoriaController(EmprendimientoCategoriaService emprendimientoCategoriaService) {
        this.emprendimientoCategoriaService = emprendimientoCategoriaService;
    }

    @GetMapping
    public List<EmprendimientoCategoriaDTO> obtenerTodos() {
        return emprendimientoCategoriaService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public EmprendimientoCategoriaDTO obtenerPorId(@PathVariable Long id) {
        return emprendimientoCategoriaService.obtenerPorId(id);
    }

    @PostMapping
    public EmprendimientoCategoriaDTO crear(@RequestBody EmprendimientoCategoriaDTO emprendimientoCategoriaDTO) {
        return emprendimientoCategoriaService.crear(emprendimientoCategoriaDTO);
    }

    @PutMapping("/{id}")
    public EmprendimientoCategoriaDTO actualizar(@PathVariable Long id, @RequestBody EmprendimientoCategoriaDTO emprendimientoCategoriaDTO) {
        return emprendimientoCategoriaService.actualizar(id, emprendimientoCategoriaDTO);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        emprendimientoCategoriaService.eliminar(id);
    }
}

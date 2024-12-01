package com.RedColem.RedColem.app.emprendimiento.controllers;

import com.RedColem.RedColem.app.emprendimiento.dtos.EmprendimientoDTO;
import com.RedColem.RedColem.app.emprendimiento.services.EmprendimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/emprendimiento")
public class EmprendimientoController {

    private final EmprendimientoService emprendimientoService;

    @Autowired
    public EmprendimientoController(EmprendimientoService emprendimientoService) {
        this.emprendimientoService = emprendimientoService;
    }

    @GetMapping
    public List<EmprendimientoDTO> obtenerTodos() {
        return emprendimientoService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public EmprendimientoDTO obtenerPorId(@PathVariable Long id) {
        return emprendimientoService.obtenerPorId(id);
    }

    @PostMapping
    public EmprendimientoDTO crear(@RequestBody EmprendimientoDTO emprendimientoDTO) {
        return emprendimientoService.crear(emprendimientoDTO);
    }

    @PutMapping("/{id}")
    public EmprendimientoDTO actualizar(@PathVariable Long id, @RequestBody EmprendimientoDTO emprendimientoDTO) {
        return emprendimientoService.actualizar(id, emprendimientoDTO);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        emprendimientoService.eliminar(id);
    }
}

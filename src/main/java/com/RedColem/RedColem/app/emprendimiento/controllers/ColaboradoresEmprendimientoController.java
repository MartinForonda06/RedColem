package com.RedColem.RedColem.app.emprendimiento.controllers;

import com.RedColem.RedColem.app.emprendimiento.dtos.ColaboradoresEmprendimientoDTO;
import com.RedColem.RedColem.app.emprendimiento.services.ColaboradoresEmprendimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/colaboradoresEmprendimiento")
public class ColaboradoresEmprendimientoController {

    private final ColaboradoresEmprendimientoService colaboradoresEmprendimientoService;

    @Autowired
    public ColaboradoresEmprendimientoController(ColaboradoresEmprendimientoService colaboradoresEmprendimientoService) {
        this.colaboradoresEmprendimientoService = colaboradoresEmprendimientoService;
    }

    @GetMapping
    public List<ColaboradoresEmprendimientoDTO> obtenerTodos() {
        return colaboradoresEmprendimientoService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public ColaboradoresEmprendimientoDTO obtenerPorId(@PathVariable Long id) {
        return colaboradoresEmprendimientoService.obtenerPorId(id);
    }

    @PostMapping
    public ColaboradoresEmprendimientoDTO crear(@RequestBody ColaboradoresEmprendimientoDTO colaboradoresEmprendimientoDTO) {
        return colaboradoresEmprendimientoService.crear(colaboradoresEmprendimientoDTO);
    }

    @PutMapping("/{id}")
    public ColaboradoresEmprendimientoDTO actualizar(@PathVariable Long id, @RequestBody ColaboradoresEmprendimientoDTO colaboradoresEmprendimientoDTO) {
        return colaboradoresEmprendimientoService.actualizar(id, colaboradoresEmprendimientoDTO);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        colaboradoresEmprendimientoService.eliminar(id);
    }
}

package com.RedColem.RedColem.app.roles.controllers;

import com.RedColem.RedColem.app.roles.dtos.EmprendedorDTO;
import com.RedColem.RedColem.app.roles.services.EmprendedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/emprendedor")
public class EmprendedorController {

    private final EmprendedorService emprendedorService;

    @Autowired
    public EmprendedorController(EmprendedorService emprendedorService) {
        this.emprendedorService = emprendedorService;
    }

    @GetMapping
    public List<EmprendedorDTO> obtenerTodos() {
        return emprendedorService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public EmprendedorDTO obtenerPorId(@PathVariable Long id) {
        return emprendedorService.obtenerPorId(id);
    }

    @PostMapping
    public EmprendedorDTO crear(@RequestBody EmprendedorDTO emprendedorDTO) {
        return emprendedorService.crear(emprendedorDTO);
    }

    @PutMapping("/{id}")
    public EmprendedorDTO actualizar(@PathVariable Long id, @RequestBody EmprendedorDTO emprendedorDTO) {
        return emprendedorService.actualizar(id, emprendedorDTO);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        emprendedorService.eliminar(id);
    }
}

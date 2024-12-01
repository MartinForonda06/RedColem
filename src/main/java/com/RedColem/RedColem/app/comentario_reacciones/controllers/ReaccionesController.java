package com.RedColem.RedColem.app.comentario_reacciones.controllers;

import com.RedColem.RedColem.app.comentario_reacciones.dtos.ReaccionesDTO;
import com.RedColem.RedColem.app.comentario_reacciones.services.ReaccionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reacciones")
public class ReaccionesController {

    private final ReaccionesService reaccionesService;

    @Autowired
    public ReaccionesController(ReaccionesService reaccionesService) {
        this.reaccionesService = reaccionesService;
    }

    @GetMapping
    public List<ReaccionesDTO> obtenerTodos() {
        return reaccionesService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public ReaccionesDTO obtenerPorId(@PathVariable Long id) {
        return reaccionesService.obtenerPorId(id);
    }

    @PostMapping
    public ReaccionesDTO crear(@RequestBody ReaccionesDTO reaccionesDTO) {
        return reaccionesService.crear(reaccionesDTO);
    }

    @PutMapping("/{id}")
    public ReaccionesDTO actualizar(@PathVariable Long id, @RequestBody ReaccionesDTO reaccionesDTO) {
        return reaccionesService.actualizar(id, reaccionesDTO);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        reaccionesService.eliminar(id);
    }
}

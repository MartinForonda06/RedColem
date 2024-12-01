package com.RedColem.RedColem.com.redcolem.app.seguidores_notificaciones.controllers;

import com.RedColem.RedColem.com.redcolem.app.seguidores_notificaciones.dtos.NotificacionDTO;
import com.RedColem.RedColem.com.redcolem.app.seguidores_notificaciones.services.NotificacionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notificaciones")
public class NotificacionesController {

    private final NotificacionesService notificacionesService;

    @Autowired
    public NotificacionesController(NotificacionesService notificacionesService) {
        this.notificacionesService = notificacionesService;
    }

    @GetMapping
    public List<NotificacionDTO> obtenerTodas() {
        return notificacionesService.obtenerTodas();
    }

    @GetMapping("/{id}")
    public NotificacionDTO obtenerPorId(@PathVariable Long id) {
        return notificacionesService.obtenerPorId(id);
    }

    @PostMapping
    public NotificacionDTO crear(@RequestBody NotificacionDTO notificacionDTO) {
        return notificacionesService.crear(notificacionDTO);
    }

    @PutMapping("/{id}")
    public NotificacionDTO actualizar(@PathVariable Long id, @RequestBody NotificacionDTO notificacionDTO) {
        return notificacionesService.actualizar(id, notificacionDTO);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        notificacionesService.eliminar(id);
    }
}

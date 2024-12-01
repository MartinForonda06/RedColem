package com.RedColem.RedColem.com.redcolem.app.seguidores_notificaciones.services;

import com.RedColem.RedColem.com.redcolem.app.seguidores_notificaciones.dtos.HistorialAccionDTO;

import java.util.List;

public interface HistorialAccionService {

    List<HistorialAccionDTO> obtenerTodos();
    HistorialAccionDTO obtenerPorId(Long id);
    HistorialAccionDTO crear(HistorialAccionDTO historialAccionDTO);
    HistorialAccionDTO actualizar(Long id, HistorialAccionDTO historialAccionDTO);
    void eliminar(Long id);
}

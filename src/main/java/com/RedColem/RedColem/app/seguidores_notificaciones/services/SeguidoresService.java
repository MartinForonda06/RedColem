package com.RedColem.RedColem.app.seguidores_notificaciones.services;

import com.RedColem.RedColem.app.seguidores_notificaciones.dtos.SeguimientoDTO;

import java.util.List;

public interface SeguidoresService {

    List<SeguimientoDTO> obtenerTodos();
    SeguimientoDTO obtenerPorId(Long id);
    SeguimientoDTO crear(SeguimientoDTO seguimientoDTO);
    void eliminar(Long id);
}

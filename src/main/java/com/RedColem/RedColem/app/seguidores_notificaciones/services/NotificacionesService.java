package com.RedColem.RedColem.app.seguidores_notificaciones.services;

import com.RedColem.RedColem.app.seguidores_notificaciones.dtos.NotificacionDTO;

import java.util.List;

public interface NotificacionesService {

    List<NotificacionDTO> obtenerTodas();
    NotificacionDTO obtenerPorId(Long id);
    NotificacionDTO crear(NotificacionDTO notificacionDTO);
    NotificacionDTO actualizar(Long id, NotificacionDTO notificacionDTO);
    void eliminar(Long id);
}

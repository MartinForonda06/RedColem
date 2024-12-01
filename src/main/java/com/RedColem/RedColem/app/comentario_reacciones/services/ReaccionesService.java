package com.RedColem.RedColem.app.comentario_reacciones.services;

import com.RedColem.RedColem.app.comentario_reacciones.dtos.ReaccionesDTO;

import java.util.List;

public interface ReaccionesService {

    List<ReaccionesDTO> obtenerTodos();
    ReaccionesDTO obtenerPorId(Long id);
    ReaccionesDTO crear(ReaccionesDTO reaccionesDTO);
    ReaccionesDTO actualizar(Long id, ReaccionesDTO reaccionesDTO);
    void eliminar(Long id);
}

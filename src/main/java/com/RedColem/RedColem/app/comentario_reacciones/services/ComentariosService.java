package com.RedColem.RedColem.app.comentario_reacciones.services;

import com.RedColem.RedColem.app.comentario_reacciones.dtos.ComentariosDTO;

import java.util.List;

public interface ComentariosService {

    List<ComentariosDTO> obtenerTodos();
    ComentariosDTO obtenerPorId(Long id);
    ComentariosDTO crear(ComentariosDTO comentariosDTO);
    ComentariosDTO actualizar(Long id, ComentariosDTO comentariosDTO);
    void eliminar(Long id);
}

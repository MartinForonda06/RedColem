package com.RedColem.RedColem.com.redcolem.app.publicacion.services;

import com.RedColem.RedColem.com.redcolem.app.publicacion.dtos.PublicacionDTO;

import java.util.List;

public interface PublicacionService {

    List<PublicacionDTO> obtenerTodos();
    PublicacionDTO obtenerPorId(Long id);
    PublicacionDTO crear(PublicacionDTO publicacionDTO);
    PublicacionDTO actualizar(Long id, PublicacionDTO publicacionDTO);
    void eliminar(Long id);
}

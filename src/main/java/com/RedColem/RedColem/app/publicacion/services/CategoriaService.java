package com.RedColem.RedColem.app.publicacion.services;

import com.RedColem.RedColem.app.publicacion.dtos.CategoriaDTO;

import java.util.List;

public interface CategoriaService {

    List<CategoriaDTO> obtenerTodos();
    CategoriaDTO obtenerPorId(Long id);
    CategoriaDTO crear(CategoriaDTO categoriaDTO);
    CategoriaDTO actualizar(Long id, CategoriaDTO categoriaDTO);
    void eliminar(Long id);
}

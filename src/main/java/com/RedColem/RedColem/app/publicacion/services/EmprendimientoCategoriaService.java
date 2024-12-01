package com.RedColem.RedColem.app.publicacion.services;

import com.RedColem.RedColem.app.publicacion.dtos.EmprendimientoCategoriaDTO;

import java.util.List;

public interface EmprendimientoCategoriaService {

    List<EmprendimientoCategoriaDTO> obtenerTodos();
    EmprendimientoCategoriaDTO obtenerPorId(Long id);
    EmprendimientoCategoriaDTO crear(EmprendimientoCategoriaDTO emprendimientoCategoriaDTO);
    EmprendimientoCategoriaDTO actualizar(Long id, EmprendimientoCategoriaDTO emprendimientoCategoriaDTO);
    void eliminar(Long id);
}

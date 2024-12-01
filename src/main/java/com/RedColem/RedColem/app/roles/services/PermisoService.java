package com.RedColem.RedColem.app.roles.services;

import com.RedColem.RedColem.app.roles.dtos.PermisoDTO;

import java.util.List;

public interface PermisoService {

    List<PermisoDTO> obtenerTodos();
    PermisoDTO obtenerPorId(Long id);
    PermisoDTO crear(PermisoDTO permisoDTO);
    PermisoDTO actualizar(Long id, PermisoDTO permisoDTO);
    void eliminar(Long id);
}

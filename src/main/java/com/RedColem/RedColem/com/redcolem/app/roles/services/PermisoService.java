package com.RedColem.RedColem.com.redcolem.app.roles.services;

import com.RedColem.RedColem.com.redcolem.app.roles.dtos.PermisoDTO;

import java.util.List;

public interface PermisoService {

    List<PermisoDTO> obtenerTodos();
    PermisoDTO obtenerPorId(Long id);
    PermisoDTO crear(PermisoDTO permisoDTO);
    PermisoDTO actualizar(Long id, PermisoDTO permisoDTO);
    void eliminar(Long id);
}

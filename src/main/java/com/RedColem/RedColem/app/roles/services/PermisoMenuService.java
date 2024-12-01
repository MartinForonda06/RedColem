package com.RedColem.RedColem.app.roles.services;

import com.RedColem.RedColem.app.roles.dtos.PermisoMenuDTO;

import java.util.List;

public interface PermisoMenuService {

    List<PermisoMenuDTO> obtenerTodos();
    PermisoMenuDTO obtenerPorId(Long id);
    PermisoMenuDTO crear(PermisoMenuDTO permisoMenuDTO);
    PermisoMenuDTO actualizar(Long id, PermisoMenuDTO permisoMenuDTO);
    void eliminar(Long id);
}

package com.RedColem.RedColem.com.redcolem.app.roles.services;

import com.RedColem.RedColem.com.redcolem.app.roles.dtos.RolDTO;

import java.util.List;

public interface RolService {

    List<RolDTO> obtenerTodos();
    RolDTO obtenerPorId(Long id);
    RolDTO crear(RolDTO rolDTO);
    RolDTO actualizar(Long id, RolDTO rolDTO);
    void eliminar(Long id);
}

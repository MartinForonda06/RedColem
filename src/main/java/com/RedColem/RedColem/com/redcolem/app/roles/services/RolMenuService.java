package com.RedColem.RedColem.com.redcolem.app.roles.services;

import com.RedColem.RedColem.com.redcolem.app.roles.dtos.RolMenuDTO;

import java.util.List;

public interface RolMenuService {

    List<RolMenuDTO> obtenerTodos();
    RolMenuDTO obtenerPorId(Long id);
    RolMenuDTO crear(RolMenuDTO rolMenuDTO);
    RolMenuDTO actualizar(Long id, RolMenuDTO rolMenuDTO);
    void eliminar(Long id);
}

package com.RedColem.RedColem.com.redcolem.app.roles.services;

import com.RedColem.RedColem.com.redcolem.app.roles.dtos.RolesusuarioDTO;

import java.util.List;

public interface RolesusuarioService {

    List<RolesusuarioDTO> obtenerTodos();
    RolesusuarioDTO obtenerPorId(Long id);
    RolesusuarioDTO crear(RolesusuarioDTO rolesusuarioDTO);
    RolesusuarioDTO actualizar(Long id, RolesusuarioDTO rolesusuarioDTO);
    void eliminar(Long id);
}

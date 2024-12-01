package com.RedColem.RedColem.app.roles.services;

import com.RedColem.RedColem.app.roles.dtos.AdministradorDTO;

import java.util.List;

public interface AdministradorService {

    List<AdministradorDTO> obtenerTodos();
    AdministradorDTO obtenerPorId(Long id);
    AdministradorDTO crear(AdministradorDTO administradorDTO);
    AdministradorDTO actualizar(Long id, AdministradorDTO administradorDTO);
    void eliminar(Long id);
}

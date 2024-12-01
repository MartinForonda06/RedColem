package com.RedColem.RedColem.com.redcolem.app.roles.services;

import com.RedColem.RedColem.com.redcolem.app.roles.dtos.ModeradorDTO;

import java.util.List;

public interface ModeradorService {

    List<ModeradorDTO> obtenerTodos();
    ModeradorDTO obtenerPorId(Long id);
    ModeradorDTO crear(ModeradorDTO moderadorDTO);
    ModeradorDTO actualizar(Long id, ModeradorDTO moderadorDTO);
    void eliminar(Long id);
}

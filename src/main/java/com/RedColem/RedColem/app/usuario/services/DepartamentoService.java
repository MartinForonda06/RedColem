package com.RedColem.RedColem.app.usuario.services;

import com.RedColem.RedColem.app.usuario.dtos.DepartamentoDTO;

import java.util.List;

public interface DepartamentoService {

    List<DepartamentoDTO> obtenerTodos();
    DepartamentoDTO obtenerPorId(Long id);
    DepartamentoDTO crear(DepartamentoDTO departamentoDTO);
    void eliminar(Long id);
}

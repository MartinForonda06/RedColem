package com.RedColem.RedColem.com.redcolem.app.usuario.services;

import com.RedColem.RedColem.com.redcolem.app.usuario.dtos.DepartamentoDTO;

import java.util.List;

public interface DepartamentoService {

    List<DepartamentoDTO> obtenerTodos();
    DepartamentoDTO obtenerPorId(Long id);
    DepartamentoDTO crear(DepartamentoDTO departamentoDTO);
    void eliminar(Long id);
}

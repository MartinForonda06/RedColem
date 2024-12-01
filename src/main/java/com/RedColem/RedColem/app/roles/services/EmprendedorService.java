package com.RedColem.RedColem.app.roles.services;

import com.RedColem.RedColem.app.roles.dtos.EmprendedorDTO;

import java.util.List;

public interface EmprendedorService {

    List<EmprendedorDTO> obtenerTodos();
    EmprendedorDTO obtenerPorId(Long id);
    EmprendedorDTO crear(EmprendedorDTO emprendedorDTO);
    EmprendedorDTO actualizar(Long id, EmprendedorDTO emprendedorDTO);
    void eliminar(Long id);
}

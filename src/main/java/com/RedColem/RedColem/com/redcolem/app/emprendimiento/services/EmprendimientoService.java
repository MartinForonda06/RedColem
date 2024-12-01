package com.RedColem.RedColem.com.redcolem.app.emprendimiento.services;

import com.RedColem.RedColem.com.redcolem.app.emprendimiento.dtos.EmprendimientoDTO;

import java.util.List;

public interface EmprendimientoService {

    List<EmprendimientoDTO> obtenerTodos();
    EmprendimientoDTO obtenerPorId(Long id);
    EmprendimientoDTO crear(EmprendimientoDTO emprendimientoDTO);
    EmprendimientoDTO actualizar(Long id, EmprendimientoDTO emprendimientoDTO);
    void eliminar(Long id);
}

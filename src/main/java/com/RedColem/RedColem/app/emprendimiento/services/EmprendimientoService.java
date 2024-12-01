package com.RedColem.RedColem.app.emprendimiento.services;

import com.RedColem.RedColem.app.emprendimiento.dtos.EmprendimientoDTO;

import java.util.List;

public interface EmprendimientoService {

    List<EmprendimientoDTO> obtenerTodos();
    EmprendimientoDTO obtenerPorId(Long id);
    EmprendimientoDTO crear(EmprendimientoDTO emprendimientoDTO);
    EmprendimientoDTO actualizar(Long id, EmprendimientoDTO emprendimientoDTO);
    void eliminar(Long id);
}

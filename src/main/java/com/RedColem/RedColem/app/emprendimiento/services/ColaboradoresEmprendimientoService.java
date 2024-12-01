package com.RedColem.RedColem.app.emprendimiento.services;

import com.RedColem.RedColem.app.emprendimiento.dtos.ColaboradoresEmprendimientoDTO;

import java.util.List;

public interface ColaboradoresEmprendimientoService {

    List<ColaboradoresEmprendimientoDTO> obtenerTodos();
    ColaboradoresEmprendimientoDTO obtenerPorId(Long id);
    ColaboradoresEmprendimientoDTO crear(ColaboradoresEmprendimientoDTO colaboradoresEmprendimientoDTO);
    ColaboradoresEmprendimientoDTO actualizar(Long id, ColaboradoresEmprendimientoDTO colaboradoresEmprendimientoDTO);
    void eliminar(Long id);
}

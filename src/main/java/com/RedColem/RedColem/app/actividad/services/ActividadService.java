package com.RedColem.RedColem.app.actividad.services;

import com.RedColem.RedColem.app.actividad.dtos.ActividadDTO;

import java.util.List;

public interface ActividadService {

    List<ActividadDTO> obtenerTodas();
    ActividadDTO obtenerPorId(Long id);
    ActividadDTO crear(ActividadDTO actividadDTO);
    ActividadDTO actualizar(Long id, ActividadDTO actividadDTO);
    void eliminar(Long id);
}

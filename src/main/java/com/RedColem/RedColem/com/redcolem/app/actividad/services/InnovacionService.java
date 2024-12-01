package com.RedColem.RedColem.com.redcolem.app.actividad.services;

import com.RedColem.RedColem.com.redcolem.app.actividad.dtos.InnovacionDTO;

import java.util.List;

public interface InnovacionService {

    List<InnovacionDTO> obtenerTodas();
    InnovacionDTO obtenerPorId(Long id);
    InnovacionDTO crear(InnovacionDTO innovacionDTO);
    InnovacionDTO actualizar(Long id, InnovacionDTO innovacionDTO);
    void eliminar(Long id);
}

package com.RedColem.RedColem.app.mensajeria.services;

import com.RedColem.RedColem.app.mensajeria.dtos.MensajeDTO;

import java.util.List;

public interface MensajeService {

    List<MensajeDTO> obtenerTodos();
    MensajeDTO obtenerPorId(Long id);
    MensajeDTO crear(MensajeDTO mensajeDTO);
    MensajeDTO actualizar(Long id, MensajeDTO mensajeDTO);
    void eliminar(Long id);
}

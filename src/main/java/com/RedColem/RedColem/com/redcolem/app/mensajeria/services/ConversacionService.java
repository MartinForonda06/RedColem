package com.RedColem.RedColem.com.redcolem.app.mensajeria.services;

import com.RedColem.RedColem.com.redcolem.app.mensajeria.dtos.ConversacionDTO;

import java.util.List;

public interface ConversacionService {

    List<ConversacionDTO> obtenerTodas();
    ConversacionDTO obtenerPorId(Long id);
    ConversacionDTO crear(ConversacionDTO conversacionDTO);
    ConversacionDTO actualizar(Long id, ConversacionDTO conversacionDTO);
    void eliminar(Long id);
}

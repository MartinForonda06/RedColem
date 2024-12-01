package com.RedColem.RedColem.app.usuario.services;

import com.RedColem.RedColem.app.usuario.dtos.UsuariodepartamentoDTO;
import java.util.List;

public interface UsuariodepartamentoService {
    List<UsuariodepartamentoDTO> findAll();
    UsuariodepartamentoDTO findById(Integer id);
    UsuariodepartamentoDTO save(UsuariodepartamentoDTO usuariodepartamentoDTO);
    void deleteById(Integer id);
}

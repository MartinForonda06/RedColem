package com.RedColem.RedColem.com.redcolem.app.usuario.services;

import com.RedColem.RedColem.com.redcolem.app.usuario.dtos.UsuariodepartamentoDTO;
import java.util.List;

public interface UsuariodepartamentoService {
    List<UsuariodepartamentoDTO> findAll();
    UsuariodepartamentoDTO findById(Integer id);
    UsuariodepartamentoDTO save(UsuariodepartamentoDTO usuariodepartamentoDTO);
    void deleteById(Integer id);
}

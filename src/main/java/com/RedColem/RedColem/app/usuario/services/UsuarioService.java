package com.RedColem.RedColem.app.usuario.services;

import com.RedColem.RedColem.app.usuario.dtos.UsuarioDTO;
import java.util.List;

public interface UsuarioService {
    List<UsuarioDTO> findAll();
    UsuarioDTO findById(Integer id);
    UsuarioDTO save(UsuarioDTO usuarioDTO);
    void deleteById(Integer id);
}

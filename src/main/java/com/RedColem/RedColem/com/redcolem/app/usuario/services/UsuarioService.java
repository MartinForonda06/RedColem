package com.RedColem.RedColem.com.redcolem.app.usuario.services;

import com.RedColem.RedColem.com.redcolem.app.usuario.dtos.UsuarioDTO;
import java.util.List;

public interface UsuarioService {
    List<UsuarioDTO> findAll();
    UsuarioDTO findById(Integer id);
    UsuarioDTO save(UsuarioDTO usuarioDTO);
    void deleteById(Integer id);
}

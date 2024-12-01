package com.RedColem.RedColem.app.login.service;

import com.RedColem.RedColem.app.login.dto.LoginResponse;
import com.RedColem.RedColem.app.usuario.entities.Usuario;
import com.RedColem.RedColem.app.login.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public LoginResponse validateLogin(String correoElectronico, String password) {
        Usuario usuario = usuarioRepository.findByCorreoElectronicoAndPassword(correoElectronico, password);
        if (usuario != null) {
            return new LoginResponse("Login exitoso", usuario.getIdUsuario(), usuario.getCorreoElectronico());
        }
        return null; // Devuelve null si no coincide
    }
}

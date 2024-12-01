package com.RedColem.RedColem.com.redcolem.app.usuario.repositories;

import com.RedColem.RedColem.com.redcolem.app.usuario.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}

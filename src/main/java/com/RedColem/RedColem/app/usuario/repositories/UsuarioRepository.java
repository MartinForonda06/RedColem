package com.RedColem.RedColem.app.usuario.repositories;

import com.RedColem.RedColem.app.usuario.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}

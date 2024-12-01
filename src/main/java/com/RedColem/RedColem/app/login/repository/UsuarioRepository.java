package com.RedColem.RedColem.app.login.repository;

import com.RedColem.RedColem.app.usuario.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByCorreoElectronicoAndPassword(String correoElectronico, String password);
}

package com.RedColem.RedColem.app.roles.entities;

import com.RedColem.RedColem.app.usuario.entities.Usuario;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

@Entity
@Getter
@Setter
public class Rolesusuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRolesusuario;

    @ManyToOne
    @JoinColumn(name = "id_Usuario")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_Rol")
    private Rol rol;

    public void setUsuario(Long idUsuario) {
    }

    public void setRol(Long idRol) {

    }
}

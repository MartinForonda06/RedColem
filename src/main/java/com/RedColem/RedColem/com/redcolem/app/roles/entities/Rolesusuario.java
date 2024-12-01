package com.RedColem.RedColem.com.redcolem.app.roles.entities;

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
    private com.RedColem.RedColem.com.redcolem.app.usuario.entities.Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_Rol")
    private Rol rol;

    public void setUsuario(Long idUsuario) {
    }

    public void setRol(Long idRol) {

    }
}

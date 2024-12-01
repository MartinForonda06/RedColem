package com.RedColem.RedColem.com.redcolem.app.roles.entities;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

@Entity
@Getter
@Setter
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRol;

    private String nombre;

    @ManyToOne
    @JoinColumn(name = "id_Usuario")
    private com.RedColem.RedColem.com.redcolem.app.usuario.entities.Usuario usuario;
}

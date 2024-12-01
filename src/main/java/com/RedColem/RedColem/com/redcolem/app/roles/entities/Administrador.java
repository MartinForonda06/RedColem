package com.RedColem.RedColem.com.redcolem.app.roles.entities;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Administrador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAdministrador;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private com.RedColem.RedColem.com.redcolem.app.usuario.entities.Usuario usuario;

    @Column(name = "fecha_asignacion")
    private LocalDateTime fechaAsignacion;

    public void setUsuario(Long idUsuario) {

    }
}

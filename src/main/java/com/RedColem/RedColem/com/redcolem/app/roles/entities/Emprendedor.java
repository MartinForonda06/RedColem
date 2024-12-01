package com.RedColem.RedColem.com.redcolem.app.roles.entities;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Emprendedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmprendedor;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private com.RedColem.RedColem.com.redcolem.app.usuario.entities.Usuario usuario;

    @Column(name = "fecha_registro")
    private LocalDateTime fechaRegistro;

    public void setUsuario(Long idUsuario) {

    }
}

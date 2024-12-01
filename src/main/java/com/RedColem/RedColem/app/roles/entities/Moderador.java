package com.RedColem.RedColem.app.roles.entities;

import com.RedColem.RedColem.app.usuario.entities.Usuario;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Moderador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idModerador;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @Column(name = "fecha_asignacion")
    private LocalDateTime fechaAsignacion;

    public void setUsuario(Long idUsuario) {
    }
}

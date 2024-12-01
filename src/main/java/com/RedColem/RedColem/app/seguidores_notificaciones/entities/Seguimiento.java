package com.RedColem.RedColem.app.seguidores_notificaciones.entities;

import com.RedColem.RedColem.app.usuario.entities.Usuario;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Seguimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSeguimiento;

    @ManyToOne
    @JoinColumn(name = "id_Usuario_Seguidor", nullable = false)
    private Usuario usuarioSeguidor;

    @ManyToOne
    @JoinColumn(name = "id_Usuario_Seguido", nullable = false)
    private Usuario usuarioSeguido;

    private LocalDateTime fechaSeguimiento;
}

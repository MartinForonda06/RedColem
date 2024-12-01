package com.RedColem.RedColem.app.seguidores_notificaciones.entities;

import com.RedColem.RedColem.app.usuario.entities.Usuario;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class HistorialAccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idHistorial;

    @ManyToOne
    @JoinColumn(name = "id_Usuario", nullable = false)
    private Usuario usuario;

    private String accion;

    private LocalDateTime fecha;
}

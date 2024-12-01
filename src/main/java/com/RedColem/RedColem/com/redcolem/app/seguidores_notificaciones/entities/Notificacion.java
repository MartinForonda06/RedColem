package com.RedColem.RedColem.com.redcolem.app.seguidores_notificaciones.entities;

import com.RedColem.RedColem.com.redcolem.app.usuario.entities.Usuario;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Notificacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idNotificacion;

    @ManyToOne
    @JoinColumn(name = "id_Usuario", nullable = false)
    private Usuario usuario;

    private String tipo; // Ejemplo: 'Nuevo comentario', 'Nueva reacción'
    private String contenido;
    private Boolean leido = false;
    private LocalDateTime fecha;
}

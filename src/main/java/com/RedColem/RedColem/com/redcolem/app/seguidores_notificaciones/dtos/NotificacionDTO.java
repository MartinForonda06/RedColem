package com.RedColem.RedColem.com.redcolem.app.seguidores_notificaciones.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NotificacionDTO {

    private Long idNotificacion;
    private Long idUsuario;
    private String tipo; // Ejemplo: 'Nuevo comentario', 'Nueva reacción'
    private String contenido;
    private Boolean leido;
    private LocalDateTime fecha;
}

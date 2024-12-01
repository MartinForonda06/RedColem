package com.RedColem.RedColem.app.seguidores_notificaciones.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HistorialAccionDTO {

    private Long idHistorial;
    private Long idUsuario;
    private String accion; // Ejemplo: 'Comentario publicado'
    private LocalDateTime fecha;
}

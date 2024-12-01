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
public class SeguimientoDTO {

    private Long idSeguimiento;
    private Long idUsuarioSeguidor;
    private Long idUsuarioSeguido;
    private LocalDateTime fechaSeguimiento;
}

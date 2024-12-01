package com.RedColem.RedColem.com.redcolem.app.actividad.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class InnovacionDTO {

    private Long idInnovacion;
    private String tipoInnovacion;
    private String impacto;
    private String descripcion;
    private LocalDateTime fecha;
    private String urlImagen;
    private String urlVideo;
}

package com.RedColem.RedColem.com.redcolem.app.publicacion.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PublicacionDTO {

    private Long idPublicacion;
    private String titulo;
    private String contenido;
    private LocalDateTime fechaCreacion;
    private Long idUsuario;
    private Long idEmprendimiento;
    private String urlImagen;
    private String urlVideo;
}

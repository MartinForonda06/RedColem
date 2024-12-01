package com.RedColem.RedColem.com.redcolem.app.comentario_reacciones.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ComentariosDTO {

    private Long idComentarios;
    private String contenido;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaModificacion;
    private String urlImagen;
    private String urlVideo;
}

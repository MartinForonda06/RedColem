package com.RedColem.RedColem.com.redcolem.app.comentario_reacciones.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReaccionesDTO {

    private Long idReacciones;
    private String tipo;
    private Long idUsuario;
    private Long idComentario;
    private Long idEmprendimiento;
    private Long idActividad;
}

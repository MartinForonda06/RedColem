package com.RedColem.RedColem.com.redcolem.app.emprendimiento.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmprendimientoDTO {

    private Long idEmprendimiento;
    private String nombre;
    //private LocalDateTime fechaCreacion;
    //private LocalDateTime fechaModificacion;
    private String descripcion;
    private String objetivo;
    private String calle;
    private String ciudad;
    private Long idDepartamento;
    private Long idUsuario;
    private String urlImagen;
    private String urlVideo;
}

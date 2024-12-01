package com.RedColem.RedColem.com.redcolem.app.publicacion.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CategoriaDTO {

    private Long idCategoria;
    private String nombre;
    private String descripcion;
    private Long idEmprendimiento;
}

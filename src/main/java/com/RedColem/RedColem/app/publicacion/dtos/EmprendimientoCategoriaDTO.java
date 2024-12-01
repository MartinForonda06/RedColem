package com.RedColem.RedColem.app.publicacion.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmprendimientoCategoriaDTO {

    private Long idEmprendimientoCategoria;
    private Long idEmprendimiento;
    private Long idCategoria;
}

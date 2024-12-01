package com.RedColem.RedColem.app.roles.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PermisoDTO {

    private Long idPermiso;
    private String nombre;
    private String descripcion;
    private String estado;
}

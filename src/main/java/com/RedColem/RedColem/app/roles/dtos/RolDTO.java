package com.RedColem.RedColem.app.roles.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RolDTO {

    private Long idRol;
    private String nombre;
    private Long idUsuario;
}

package com.RedColem.RedColem.app.roles.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmprendedorDTO {

    private Long idEmprendedor;
    private Long idUsuario;
    private LocalDateTime fechaRegistro;
}

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
public class ColaboradoresEmprendimientoDTO {

    private Long idColaborador;
    private Long idEmprendimiento;
    private Long idUsuario;
    private String rol;
    private LocalDateTime fechaIncorporacion;
}

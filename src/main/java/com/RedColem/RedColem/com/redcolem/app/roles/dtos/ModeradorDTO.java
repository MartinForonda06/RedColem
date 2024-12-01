package com.RedColem.RedColem.com.redcolem.app.roles.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ModeradorDTO {

    private Long idModerador;
    private Long idUsuario;
    private LocalDateTime fechaAsignacion;
}

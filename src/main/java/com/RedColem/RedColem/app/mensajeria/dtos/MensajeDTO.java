package com.RedColem.RedColem.app.mensajeria.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MensajeDTO {

    private Long idMensaje;
    private String contenido;
    private LocalDateTime fechaEnvio;
    private Long idConversacion;
    private Long idUsuario;
}

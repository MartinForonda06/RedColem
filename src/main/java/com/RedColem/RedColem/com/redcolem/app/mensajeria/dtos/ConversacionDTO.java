package com.RedColem.RedColem.com.redcolem.app.mensajeria.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ConversacionDTO {

    private Long idConversacion;
    private LocalDateTime fechaCreacion;
    private Long idUsuarioCreador;
}

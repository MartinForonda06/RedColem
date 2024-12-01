package com.RedColem.RedColem.app.login.dto;

public class LoginResponse {
    private String mensaje;
    private Long userId;
    private String username;

    public LoginResponse(String mensaje, Integer userId, String username) {
        this.mensaje = mensaje;
        this.userId = Long.valueOf(userId);
        this.username = username;
    }

    // Getters y setters
}

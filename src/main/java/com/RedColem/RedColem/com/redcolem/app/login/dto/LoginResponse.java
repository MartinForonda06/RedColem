package com.RedColem.RedColem.com.redcolem.app.login.model;

public class LoginResponse {
    private String mensaje;
    private Long userId;
    private String username;

    public LoginResponse(String mensaje, Long userId, String username) {
        this.mensaje = mensaje;
        this.userId = userId;
        this.username = username;
    }

    // Getters y setters
}

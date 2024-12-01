package com.RedColem.RedColem.app.roles.entities;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

@Entity
@Getter
@Setter
public class PermisoMenu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPermisoMenu;

    @ManyToOne
    @JoinColumn(name = "id_permiso")
    private Permiso permiso;

    @ManyToOne
    @JoinColumn(name = "id_menu")
    private Menu menu;

    public void setPermiso(Long idPermiso) {
    }

    public void setMenu(Long idMenu) {

    }
}

package com.RedColem.RedColem.com.redcolem.app.roles.entities;

import com.RedColem.RedColem.com.redcolem.app.roles.entities.Rol;
import com.RedColem.RedColem.com.redcolem.app.roles.entities.Menu;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

@Entity
@Getter
@Setter
public class RolMenu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRolMenu;

    @ManyToOne
    @JoinColumn(name = "id_Rol", nullable = false)
    private Rol rol;

    @ManyToOne
    @JoinColumn(name = "id_Menu", nullable = false)
    private Menu menu;
}

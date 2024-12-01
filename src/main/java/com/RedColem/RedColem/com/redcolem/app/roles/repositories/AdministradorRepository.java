package com.RedColem.RedColem.com.redcolem.app.roles.repositories;

import com.RedColem.RedColem.com.redcolem.app.roles.entities.Administrador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministradorRepository extends JpaRepository<Administrador, Long> {
}

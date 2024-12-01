package com.RedColem.RedColem.com.redcolem.app.roles.repositories;

import com.RedColem.RedColem.com.redcolem.app.roles.entities.Rolesusuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolesusuarioRepository extends JpaRepository<Rolesusuario, Long> {
}

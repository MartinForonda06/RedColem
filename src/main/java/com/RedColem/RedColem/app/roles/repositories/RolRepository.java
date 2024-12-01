package com.RedColem.RedColem.app.roles.repositories;

import com.RedColem.RedColem.app.roles.entities.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol, Long> {
}

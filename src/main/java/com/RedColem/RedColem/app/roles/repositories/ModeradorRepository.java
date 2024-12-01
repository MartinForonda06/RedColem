package com.RedColem.RedColem.app.roles.repositories;

import com.RedColem.RedColem.app.roles.entities.Moderador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModeradorRepository extends JpaRepository<Moderador, Long> {
}

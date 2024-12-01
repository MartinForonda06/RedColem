package com.RedColem.RedColem.app.mensajeria.repositories;

import com.RedColem.RedColem.app.mensajeria.entities.Mensaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MensajeRepository extends JpaRepository<Mensaje, Long> {
}

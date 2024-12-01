package com.RedColem.RedColem.com.redcolem.app.mensajeria.repositories;

import com.RedColem.RedColem.com.redcolem.app.mensajeria.entities.Mensaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MensajeRepository extends JpaRepository<Mensaje, Long> {
}

package com.RedColem.RedColem.app.mensajeria.repositories;

import com.RedColem.RedColem.app.mensajeria.entities.Conversacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConversacionRepository extends JpaRepository<Conversacion, Long> {
}

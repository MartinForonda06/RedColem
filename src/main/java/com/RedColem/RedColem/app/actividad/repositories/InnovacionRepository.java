package com.RedColem.RedColem.app.actividad.repositories;

import com.RedColem.RedColem.app.actividad.entities.Innovacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InnovacionRepository extends JpaRepository<Innovacion, Long> {
}

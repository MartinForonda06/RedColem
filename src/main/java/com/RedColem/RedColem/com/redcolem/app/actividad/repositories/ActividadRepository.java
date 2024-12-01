package com.RedColem.RedColem.com.redcolem.app.actividad.repositories;

import com.RedColem.RedColem.com.redcolem.app.actividad.entities.Actividad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActividadRepository extends JpaRepository<Actividad, Long> {
}

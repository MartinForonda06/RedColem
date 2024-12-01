package com.RedColem.RedColem.app.actividad.repositories;

import com.RedColem.RedColem.app.actividad.entities.Actividad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActividadRepository extends JpaRepository<Actividad, Long> {
}

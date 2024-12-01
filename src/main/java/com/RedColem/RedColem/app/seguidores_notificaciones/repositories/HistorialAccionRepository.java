package com.RedColem.RedColem.app.seguidores_notificaciones.repositories;

import com.RedColem.RedColem.app.seguidores_notificaciones.entities.HistorialAccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistorialAccionRepository extends JpaRepository<HistorialAccion, Long> {
}

package com.RedColem.RedColem.com.redcolem.app.seguidores_notificaciones.repositories;

import com.RedColem.RedColem.com.redcolem.app.seguidores_notificaciones.entities.Notificacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificacionesRepository extends JpaRepository<Notificacion, Long> {
}

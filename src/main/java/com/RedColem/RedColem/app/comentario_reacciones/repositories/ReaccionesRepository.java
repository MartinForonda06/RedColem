package com.RedColem.RedColem.app.comentario_reacciones.repositories;

import com.RedColem.RedColem.app.comentario_reacciones.entities.Reacciones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReaccionesRepository extends JpaRepository<Reacciones, Long> {
}

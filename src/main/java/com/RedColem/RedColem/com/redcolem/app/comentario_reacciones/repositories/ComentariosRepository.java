package com.RedColem.RedColem.com.redcolem.app.comentario_reacciones.repositories;

import com.RedColem.RedColem.com.redcolem.app.comentario_reacciones.entities.Comentarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComentariosRepository extends JpaRepository<Comentarios, Long> {
}

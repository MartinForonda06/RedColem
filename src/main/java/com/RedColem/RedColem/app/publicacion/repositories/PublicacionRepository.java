package com.RedColem.RedColem.app.publicacion.repositories;

import com.RedColem.RedColem.app.publicacion.entities.Publicacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublicacionRepository extends JpaRepository<Publicacion, Long> {
}

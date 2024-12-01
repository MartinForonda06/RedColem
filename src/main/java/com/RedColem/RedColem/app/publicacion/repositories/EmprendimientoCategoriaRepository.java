package com.RedColem.RedColem.app.publicacion.repositories;

import com.RedColem.RedColem.app.publicacion.entities.EmprendimientoCategoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmprendimientoCategoriaRepository extends JpaRepository<EmprendimientoCategoria, Long> {
}

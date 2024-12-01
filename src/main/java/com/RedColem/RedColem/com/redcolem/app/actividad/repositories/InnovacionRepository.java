package com.RedColem.RedColem.com.redcolem.app.actividad.repositories;

import com.RedColem.RedColem.com.redcolem.app.actividad.entities.Innovacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InnovacionRepository extends JpaRepository<Innovacion, Long> {
}

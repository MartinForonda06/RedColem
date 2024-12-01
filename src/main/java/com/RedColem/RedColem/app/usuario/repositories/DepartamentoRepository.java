package com.RedColem.RedColem.app.usuario.repositories;

import com.RedColem.RedColem.app.usuario.entities.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartamentoRepository extends JpaRepository<Departamento, Long> {
}

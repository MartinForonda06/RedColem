package com.RedColem.RedColem.com.redcolem.app.usuario.repositories;

import com.RedColem.RedColem.com.redcolem.app.usuario.entities.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartamentoRepository extends JpaRepository<Departamento, Long> {
}

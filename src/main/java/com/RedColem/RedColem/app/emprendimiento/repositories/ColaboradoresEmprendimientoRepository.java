package com.RedColem.RedColem.app.emprendimiento.repositories;

import com.RedColem.RedColem.app.emprendimiento.entities.ColaboradoresEmprendimiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColaboradoresEmprendimientoRepository extends JpaRepository<ColaboradoresEmprendimiento, Long> {
}
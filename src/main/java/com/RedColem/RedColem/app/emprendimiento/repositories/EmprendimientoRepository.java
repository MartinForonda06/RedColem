package com.RedColem.RedColem.app.emprendimiento.repositories;

import com.RedColem.RedColem.app.emprendimiento.entities.Emprendimiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmprendimientoRepository extends JpaRepository<Emprendimiento, Long> {
}

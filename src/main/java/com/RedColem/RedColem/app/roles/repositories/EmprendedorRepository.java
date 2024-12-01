package com.RedColem.RedColem.app.roles.repositories;

import com.RedColem.RedColem.app.roles.entities.Emprendedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmprendedorRepository extends JpaRepository<Emprendedor, Long> {
}

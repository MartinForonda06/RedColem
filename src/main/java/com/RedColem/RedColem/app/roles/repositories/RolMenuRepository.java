package com.RedColem.RedColem.app.roles.repositories;

import com.RedColem.RedColem.app.roles.entities.RolMenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolMenuRepository extends JpaRepository<RolMenu, Long> {
}

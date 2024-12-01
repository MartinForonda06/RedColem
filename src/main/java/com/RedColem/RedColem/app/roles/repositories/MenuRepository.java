package com.RedColem.RedColem.app.roles.repositories;

import com.RedColem.RedColem.app.roles.entities.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Long> {
}

package com.project_management.project_management.repository;

import com.project_management.project_management.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolesRepository extends JpaRepository<Role, Long> {
}

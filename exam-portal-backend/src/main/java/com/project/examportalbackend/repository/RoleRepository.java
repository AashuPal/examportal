package com.project.examportalbackend.repository;

import com.project.examportalbackend.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, String> {
    Optional<Object> findByRoleName(String admin);
}

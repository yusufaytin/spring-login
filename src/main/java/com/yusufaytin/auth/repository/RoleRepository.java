package com.yusufaytin.auth.repository;

import com.yusufaytin.auth.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long>{
}

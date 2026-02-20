package com.codeo.company.admin.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codeo.company.admin.entity.AdminUser;

public interface AdminUserRepository
        extends JpaRepository<AdminUser, Long> {

    Optional<AdminUser> findByEmail(String email);
}
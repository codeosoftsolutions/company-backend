package com.codeo.company.client.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.codeo.company.client.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
}




package com.codeo.company.services.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.codeo.company.services.entity.ServiceEntity1;

public interface ServiceRepository extends JpaRepository<ServiceEntity1, Long> {
}
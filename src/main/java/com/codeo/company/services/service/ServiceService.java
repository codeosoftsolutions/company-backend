

package com.codeo.company.services.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.codeo.company.services.entity.ServiceEntity1;
import com.codeo.company.services.repository.ServiceRepository;

@Service
public class ServiceService {

    private final ServiceRepository repository;

    public ServiceService(ServiceRepository repository) {
        this.repository = repository;
    }

    public List<ServiceEntity1> getAllServices() {
        return repository.findAll();
    }

    public ServiceEntity1 addService(ServiceEntity1 service) {
        return repository.save(service);
    }
}
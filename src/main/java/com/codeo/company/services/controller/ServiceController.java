



package com.codeo.company.services.controller;

import java.util.List;



import org.springframework.web.bind.annotation.*;
import com.codeo.company.services.entity.ServiceEntity1;
import com.codeo.company.services.service.ServiceService;

@RestController
@RequestMapping("/api/services")
@CrossOrigin(origins = "*")
public class ServiceController {

    private final ServiceService service;

    public ServiceController(ServiceService service) {
        this.service = service;
    }

    @GetMapping
    public List<ServiceEntity1> getServices() {
        return service.getAllServices();
    }

    @PostMapping
    public ServiceEntity1 addService(@RequestBody ServiceEntity1 serviceEntity) {
        return service.addService(serviceEntity);
    }
}
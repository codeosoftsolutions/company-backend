

package com.codeo.company.services.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "services")
public class ServiceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String serviceName;

    @Column(length = 500)
    private String description;

    // constructors
    public ServiceEntity() {}

    public ServiceEntity(String serviceName, String description) {
        this.serviceName = serviceName;
        this.description = description;
    }

    // getters & setters
    public Long getId() {
        return id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
package com.codeo.company.services.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "services1")
public class ServiceEntity1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String serviceName;

    @Column(length = 500)
    private String description;

    // ✅ NEW FIELD
    @Column(nullable = false)
    private String portfolioUrl;

    public ServiceEntity1() {}

    public ServiceEntity1(String serviceName, String description, String portfolioUrl) {
        this.serviceName = serviceName;
        this.description = description;
        this.portfolioUrl = portfolioUrl;
    }

    public Long getId() {
        return id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public String getDescription() {
        return description;
    }

    public String getPortfolioUrl() {
        return portfolioUrl;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPortfolioUrl(String portfolioUrl) {
        this.portfolioUrl = portfolioUrl;
    }
}
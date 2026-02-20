package com.codeo.company.companyinfo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class CompanyInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 2000)
    private String about;

    @Column(length = 1000)
    private String mission;

    @Column(length = 1000)
    private String vision;

    private String email;
    private String phone;
    private String address;

    private String linkedin;
    private String instagram;
    private String facebook;
    private String youtube;
    private String website;

    // getters & setters
}
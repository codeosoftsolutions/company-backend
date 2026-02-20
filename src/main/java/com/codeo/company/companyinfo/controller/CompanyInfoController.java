package com.codeo.company.companyinfo.controller;

import org.springframework.web.bind.annotation.*;

import com.codeo.company.companyinfo.entity.CompanyInfo;
import com.codeo.company.companyinfo.service.CompanyInfoService;

@RestController
public class CompanyInfoController {

    private final CompanyInfoService service;

    public CompanyInfoController(CompanyInfoService service) {
        this.service = service;
    }

    // ADMIN API
    @PostMapping("/admin/company")
    public CompanyInfo save(@RequestBody CompanyInfo info) {
        return service.save(info);
    }

    // PUBLIC API
    @GetMapping("/public/company")
    public CompanyInfo getCompanyInfo() {
        return service.getCompanyInfo();
    }
}
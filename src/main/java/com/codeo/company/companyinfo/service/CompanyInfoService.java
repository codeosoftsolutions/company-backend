package com.codeo.company.companyinfo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codeo.company.companyinfo.entity.CompanyInfo;
import com.codeo.company.companyinfo.repository.CompanyInfoRepository;

@Service
public class CompanyInfoService {

    private final CompanyInfoRepository repository;

    public CompanyInfoService(CompanyInfoRepository repository) {
        this.repository = repository;
    }

    public CompanyInfo save(CompanyInfo info) {
        return repository.save(info);
    }

    public CompanyInfo getCompanyInfo() {
        return repository.findAll()
                .stream()
                .findFirst()
                .orElse(null);
    }
}
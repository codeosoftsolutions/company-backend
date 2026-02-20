package com.codeo.company.companyinfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.codeo.company.companyinfo.entity.CompanyInfo;

public interface CompanyInfoRepository
        extends JpaRepository<CompanyInfo, Long> {
}
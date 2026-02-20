package com.codeo.company.employee.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.codeo.company.employee.entity.Employee;
import com.codeo.company.employee.repository.EmployeeRepository;
import com.codeo.company.media.service.CloudinaryService;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final CloudinaryService cloudinaryService;

    public EmployeeService(EmployeeRepository employeeRepository,
                           CloudinaryService cloudinaryService) {
        this.employeeRepository = employeeRepository;
        this.cloudinaryService = cloudinaryService;
    }

    public Employee saveEmployee(
            String name,
            String designation,
            String portfolioUrl,
            MultipartFile photo) throws Exception {

        String imageUrl = cloudinaryService.uploadImage(photo);

        Employee emp = new Employee();
        emp.setName(name);
        emp.setDesignation(designation);
        emp.setPortfolioUrl(portfolioUrl);
        emp.setPhotoUrl(imageUrl);

        return employeeRepository.save(emp);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}
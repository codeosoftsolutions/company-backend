package com.codeo.company.employee.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import com.codeo.company.employee.entity.Employee;
import com.codeo.company.employee.service.EmployeeService;

@RestController
@RequestMapping("/admin")
public class AdminEmployeeController {

    private final EmployeeService employeeService;

    public AdminEmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping(value = "/employee",
            consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public Employee addEmployee(
            @RequestParam String name,
            @RequestParam String designation,
            @RequestParam String portfolioUrl,
            @RequestParam MultipartFile photo) throws Exception {

        return employeeService.saveEmployee(
                name, designation, portfolioUrl, photo);
    }
}
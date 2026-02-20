package com.codeo.company.admin.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.*;

import com.codeo.company.admin.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {

    private final AdminService service;

    public AdminController(AdminService service) {
        this.service = service;
    }

    // create admin once
    @PostMapping("/create")
    public String create(
            @RequestParam String email,
            @RequestParam String password) {

        service.createAdmin(email, password);
        return "Admin created";
    }
    
    
    @PostMapping("/login")
    public Map<String, String> login(
            @RequestParam String email,
            @RequestParam String password) {

        String token = service.loginAndGenerateToken(email, password);

        if (token == null) {
            return Map.of("error", "Invalid credentials");
        }

        return Map.of("token", token);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    // login API
   // @PostMapping("/login")
   /* public String login(
            @RequestParam String email,
            @RequestParam String password) {

        boolean success = service.login(email, password);

        return success ? "Login successful" : "Invalid credentials";
    }*/
}
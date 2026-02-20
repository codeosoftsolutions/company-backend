



package com.codeo.company.client.controller;

import java.util.List;


import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import com.codeo.company.client.entity.Client;
import com.codeo.company.client.service.ClientService;

@RestController
@CrossOrigin(origins = "*")
public class ClientController {

    private final ClientService service;

    public ClientController(ClientService service) {
        this.service = service;
    }

    // ADMIN
    @PostMapping("/admin/client")
    public Client addClient(
            @RequestParam String name,
            @RequestParam MultipartFile logo,

            @RequestParam(required = false) String websiteUrl,
            @RequestParam(required = false) String linkedinUrl,
            @RequestParam(required = false) String instagramUrl,
            @RequestParam(required = false) String facebookUrl,
            @RequestParam(required = false) String youtubeUrl,
            @RequestParam(required = false) String twitterUrl
    ) throws Exception {

        return service.saveClient(
                name,
                logo,
                websiteUrl,
                linkedinUrl,
                instagramUrl,
                facebookUrl,
                youtubeUrl,
                twitterUrl
        );
    }

    // PUBLIC
    @GetMapping("/public/clients")
    public List<Client> getClients() {
        return service.getAllClients();
    }
}
















/*package com.codeo.company.client.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.codeo.company.client.entity.Client;
import com.codeo.company.client.service.ClientService;

@RestController
public class ClientController {

    private final ClientService service;

    public ClientController(ClientService service) {
        this.service = service;
    }

    @PostMapping("/admin/client")
    public Client addClient(
        @RequestParam String name,
        @RequestParam MultipartFile logo) throws Exception {

        return service.save(name, logo);
    }

    @GetMapping("/public/clients")
    public List<Client> getClients() {
        return service.getAll();
    }
}*/
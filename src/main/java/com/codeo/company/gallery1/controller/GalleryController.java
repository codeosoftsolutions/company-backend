package com.codeo.company.gallery1.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.codeo.company.gallery1.entity.Gallery;
import com.codeo.company.gallery1.service.GalleryService;

@RestController
@CrossOrigin(origins = "*")
public class GalleryController {

    private final GalleryService service;

    public GalleryController(GalleryService service) {
        this.service = service;
    }

    @PostMapping("/admin/gallery")
    public Gallery upload(@RequestParam MultipartFile image)
            throws Exception {
        return service.upload(image);
    }

    @GetMapping("/public/gallery")
    public List<Gallery> list() {
        return service.all();
    }
}

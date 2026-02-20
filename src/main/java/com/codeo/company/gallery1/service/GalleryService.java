package com.codeo.company.gallery1.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.codeo.company.gallery1.entity.Gallery;
import com.codeo.company.gallery1.repository.GalleryRepository;
import com.codeo.company.media.service.CloudinaryService;

@Service
public class GalleryService {

    private final GalleryRepository repo;
    private final CloudinaryService cloudinary;

    public GalleryService(GalleryRepository repo,
                          CloudinaryService cloudinary) {
        this.repo = repo;
        this.cloudinary = cloudinary;
    }

    public Gallery upload(MultipartFile image) throws Exception {
        String url = cloudinary.uploadImage(image);
        Gallery g = new Gallery();
        g.setImageUrl(url);
        return repo.save(g);
    }

    public List<Gallery> all() {
        return repo.findAll();
    }
}
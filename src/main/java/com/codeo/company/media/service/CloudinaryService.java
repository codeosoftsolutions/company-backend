package com.codeo.company.media.service;

import java.io.IOException;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

@Service
public class CloudinaryService {

    private final Cloudinary cloudinary;

    public CloudinaryService(Cloudinary cloudinary) {
        this.cloudinary = cloudinary;
    }

    
    
    public String uploadImage(MultipartFile file) throws Exception {

        Map uploadResult = cloudinary.uploader().upload(
            file.getBytes(),
            ObjectUtils.asMap(
                "folder", "gallery",
                "format", "jpg"   // 👈 FORCE JPG (THIS FIXES YOUR ISSUE)
            )
        );

        return uploadResult.get("secure_url").toString();
    }
}
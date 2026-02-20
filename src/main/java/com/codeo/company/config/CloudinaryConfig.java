package com.codeo.company.config;

import java.util.HashMap;

import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cloudinary.Cloudinary;

@Configuration
public class CloudinaryConfig {

    @Bean
    public Cloudinary cloudinary() {

        Map<String, String> config = new HashMap<>();
        config.put("cloud_name", "dwo42utuh");
        config.put("api_key", "592262156142791");
        config.put("api_secret", "hVkUr-Kudwdw5ramsKZmagnOb9E");

        return new Cloudinary(config);
    }
}
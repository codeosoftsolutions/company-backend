package com.codeo.company.client.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String logoUrl;
    
 // website
    private String websiteUrl;

    // social links
    private String linkedinUrl;
    private String instagramUrl;
    private String facebookUrl;
    private String youtubeUrl;
    private String twitterUrl;

    
    
    
    

    // getters & setters
}
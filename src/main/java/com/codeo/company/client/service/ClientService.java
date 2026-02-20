





package com.codeo.company.client.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.codeo.company.client.entity.Client;
import com.codeo.company.client.repository.ClientRepository;
import com.codeo.company.media.service.CloudinaryService;

@Service
public class ClientService {

    private final ClientRepository repository;
    private final CloudinaryService cloudinaryService;

    public ClientService(ClientRepository repository,
                         CloudinaryService cloudinaryService) {
        this.repository = repository;
        this.cloudinaryService = cloudinaryService;
    }

    public Client saveClient(
            String name,
            MultipartFile logo,
            String websiteUrl,
            String linkedinUrl,
            String instagramUrl,
            String facebookUrl,
            String youtubeUrl,
            String twitterUrl
    ) throws Exception {

        String logoUrl = cloudinaryService.uploadImage(logo);

        Client client = new Client();
        client.setName(name);
        client.setLogoUrl(logoUrl);

        client.setWebsiteUrl(websiteUrl);
        client.setLinkedinUrl(linkedinUrl);
        client.setInstagramUrl(instagramUrl);
        client.setFacebookUrl(facebookUrl);
        client.setYoutubeUrl(youtubeUrl);
        client.setTwitterUrl(twitterUrl);

        return repository.save(client);
    }

    public List<Client> getAllClients() {
        return repository.findAll();
    }
}







































/*package com.codeo.company.client.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.codeo.company.client.entity.Client;
import com.codeo.company.client.repository.ClientRepository;
import com.codeo.company.media.service.CloudinaryService;

@Service
public class ClientService {

    private final ClientRepository repo;
    private final CloudinaryService cloudinary;

    public ClientService(ClientRepository repo,
                         CloudinaryService cloudinary) {
        this.repo = repo;
        this.cloudinary = cloudinary;
    }

    public Client save(String name, MultipartFile logo) throws Exception {

        String url = cloudinary.uploadImage(logo);

        Client c = new Client();
        c.setName(name);
        c.setLogoUrl(url);

        return repo.save(c);
    }

    public List<Client> getAll() {
        return repo.findAll();
    }
}*/
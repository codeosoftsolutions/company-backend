package com.codeo.company.video.controller;

import java.util.List;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.codeo.company.video.entity.Video;
import com.codeo.company.video.repository.VideoRepository;

@RestController
@CrossOrigin(origins = "*")
public class VideoController {

    private final VideoRepository repo;

    public VideoController(VideoRepository repo) {
        this.repo = repo;
    }

    @PostMapping("/admin/video")
    public Video add(@RequestParam String title,
                     @RequestParam String videoUrl) {

        Video v = new Video();
        v.setTitle(title);
        v.setVideoUrl(videoUrl);
        return repo.save(v);
    }

    @GetMapping("/public/videos")
    public List<Video> all() {
        return repo.findAll();
    }
}

package com.codeo.company.video.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codeo.company.video.entity.Video;

public interface VideoRepository extends JpaRepository<Video, Long> {

}

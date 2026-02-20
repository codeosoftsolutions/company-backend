package com.codeo.company.gallery1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codeo.company.gallery1.entity.Gallery;

public interface GalleryRepository extends JpaRepository<Gallery, Long>{

}

package com.rodrigo.crudspring.repository;

import com.rodrigo.crudspring.model.Video;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoRepository extends JpaRepository<Video, Long> {
    //
}

package com.rodrigo.crudspring.controller;

import java.util.List;

import com.rodrigo.crudspring.model.Video;
import com.rodrigo.crudspring.repository.VideoRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/api/videos")
public class VideoController {
    
    private final VideoRepository videoRepository;

    @GetMapping
    public List<Video> list() {
        return videoRepository.findAll();
    }
}

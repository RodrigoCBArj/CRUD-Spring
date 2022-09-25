package com.rodrigo.crudspring.controller;

import java.util.List;

import com.rodrigo.crudspring.model.Video;
import com.rodrigo.crudspring.repository.VideoRepository;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Video save(@RequestBody Video video) {
//        return ResponseEntity.status(HttpStatus.CREATED)
//                .body(videoRepository.save(video));
        return videoRepository.save(video);
    }
}

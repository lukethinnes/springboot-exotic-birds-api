package com.example.demo.bird;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/bird")

public class BirdController {
    
    private final BirdService birdService;

    @Autowired
    public BirdController(BirdService birdService) {
        this.birdService = birdService;
    }

    @GetMapping
    public List<Bird> getBirds() {
        return birdService.getBirds();
    }

}


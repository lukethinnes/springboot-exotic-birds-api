package com.example.demo.bird;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class BirdService {

    public List<Bird> getBirds() {
        return List.of(
            new Bird(
                1L,
                "Flamingo",
                "Phoenicopterus",
                1831
            )
        );
    }
}


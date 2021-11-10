package com.example.demo.bird;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BirdService {

    private final BirdRepository birdRepository;

    @Autowired
    public BirdService(BirdRepository birdRepository) {
        this.birdRepository = birdRepository;
    }

    public List<Bird> getBirds() {
        return birdRepository.findAll();
    }
    
    public void addNewBird(Bird bird) {
        System.out.println(bird);    
    }
}


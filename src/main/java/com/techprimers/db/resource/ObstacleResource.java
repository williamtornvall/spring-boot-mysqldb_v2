package com.techprimers.db.resource;

import com.techprimers.db.model.Obstacle;
import com.techprimers.db.repository.ObstacleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/obstacles")
public class ObstacleResource {

    @Autowired
    ObstacleRepository obstacleRepository;

    @GetMapping(value = "/all")
    public List<Obstacle> getAll() {
        return obstacleRepository.findAll();
    }
    @PostMapping(value = "/load", consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<Obstacle> persist(@RequestBody final Obstacle obstacle) {
        obstacleRepository.save(obstacle);
        return obstacleRepository.findAll();
    }

}
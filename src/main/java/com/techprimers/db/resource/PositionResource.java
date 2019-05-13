package com.techprimers.db.resource;
import com.techprimers.db.model.Obstacle;
import com.techprimers.db.repository.PositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/position")
public class PositionResource {

    @Autowired
    PositionRepository positionRepository;

    @GetMapping(value = "/all")
    public List<Obstacle>getAll(){
        return positionRepository.findAll();
    }
    @PostMapping(value = "/load", consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<Obstacle> persist(@RequestBody final Obstacle position) {
        positionRepository.save(position);
        return positionRepository.findAll();
    }
}


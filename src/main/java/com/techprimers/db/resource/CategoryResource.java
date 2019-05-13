package com.techprimers.db.resource;

import com.techprimers.db.model.Category;
import com.techprimers.db.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/categories")
public class CategoryResource {

    @Autowired
    CategoryRepository categoryRepository;

    @GetMapping(value = "/all")
    public List<Category> getAll() {
        return categoryRepository.findAll();
    }
    @PostMapping(value = "/load", consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<Category> persist(@RequestBody final Category category) {
        categoryRepository.save(category);
        return categoryRepository.findAll();
    }

}
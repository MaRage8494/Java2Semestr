package com.example.Java_spring_task14.controllers;

import com.example.Java_spring_task14.dao.DepartureDAO;
import com.example.Java_spring_task14.models.Departure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostsController {
    private final DepartureDAO departureDAO;

    @Autowired
    public PostsController(DepartureDAO departureDAO) {
        this.departureDAO = departureDAO;
    }

    @GetMapping
    public List<Departure> getAll() {
        return departureDAO.findAll();
    }

    @PostMapping
    public HttpStatus add(@RequestBody Departure departure){
        departureDAO.save(departure);
        return HttpStatus.OK;
    }

    @DeleteMapping("/{creationDate}")
    public HttpStatus delete(@PathVariable("creationDate") String creationDate) {
        departureDAO.delete(creationDate);
        return HttpStatus.OK;
    }
}

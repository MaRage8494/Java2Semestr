package com.example.Java_spring_task14.controllers;

import com.example.Java_spring_task14.dao.PostOfficeDAO;
import com.example.Java_spring_task14.models.PostOffice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class PostOfficeController {
    private final PostOfficeDAO manufactureDAO;

    @Autowired
    public PostOfficeController(PostOfficeDAO manufactureDAO) {
        this.manufactureDAO = manufactureDAO;
    }

    @GetMapping
    public List<PostOffice> getAll() {
        return manufactureDAO.findAll();
    }

    @DeleteMapping("/{name}")
    public HttpStatus deleteByName(@PathVariable("name") String name ) {
        manufactureDAO.delete(name);
        return HttpStatus.OK;
    }

    @PostMapping
    public HttpStatus add(@RequestBody PostOffice postOffice) {
        manufactureDAO.save(postOffice);
        return HttpStatus.OK;
    }
}

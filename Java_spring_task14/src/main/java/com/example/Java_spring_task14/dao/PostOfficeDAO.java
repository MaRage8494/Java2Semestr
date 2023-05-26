package com.example.Java_spring_task14.dao;

import com.example.Java_spring_task14.models.PostOffice;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PostOfficeDAO {
    private ArrayList<PostOffice> postOffices;

    public PostOfficeDAO() {
        postOffices = new ArrayList<>();
        postOffices.add(new PostOffice("Marat", "Moscow"));
        postOffices.add(new PostOffice("Vitya", "Moscow"));
        postOffices.add(new PostOffice("Kolya", "Moscow"));
        postOffices.add(new PostOffice("Roma", "Moscow"));
        postOffices.add(new PostOffice("Lexa", "Moscow"));
    }

    public List<PostOffice> findAll() {
        return postOffices;
    }

    public void save(PostOffice postOffice) {

        postOffices.add(postOffice);
    }

    public void delete(String name) {
        postOffices.removeIf(it -> it.getName().equals(name));
    }
}

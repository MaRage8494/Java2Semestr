package com.example.Java_spring_task14.models;

import lombok.Data;

@Data
public class PostOffice {
    private String name;
    private String city;
    public PostOffice(String name, String city) {
        this.name = name;
        this.city = city;
    }
}

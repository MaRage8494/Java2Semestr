package com.example.Java_spring_task14.models;

import lombok.Data;

@Data
public class Departure {
    private  String type;

    public Departure(String type, String DepartureDate) {
        this.type = type;
        this.DepartureDate = DepartureDate;
    }

    private String DepartureDate;

}

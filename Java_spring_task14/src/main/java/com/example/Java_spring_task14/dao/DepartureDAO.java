package com.example.Java_spring_task14.dao;

import com.example.Java_spring_task14.models.Departure;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DepartureDAO {
    private ArrayList<Departure> departures;

    public DepartureDAO() {
        departures = new ArrayList<>();
        departures.add(new Departure("a", "04.03.2022"));
        departures.add(new Departure("ab", "03.03.2022"));
        departures.add(new Departure("ac", "02.03.2022"));
        departures.add(new Departure("ad", "01.03.2022"));
        departures.add(new Departure("ae", "12.03.2022"));
        departures.add(new Departure("af", "13.03.2022"));
    }

    public void save(Departure departure) {
        departures.add(departure);
    }

    public void delete(String creationDate) {
        departures.removeIf(it -> it.getDepartureDate().equals(creationDate));
    }

    public List<Departure> findAll() {
        return departures;
    }
}

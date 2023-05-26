package com.example.demo.Task10;

import org.springframework.stereotype.Component;

@Component("boxer")
public class Boxer implements Lighter {
    @Override
    public void doFight() {
        System.out.println("I'm boxer");
    }
}

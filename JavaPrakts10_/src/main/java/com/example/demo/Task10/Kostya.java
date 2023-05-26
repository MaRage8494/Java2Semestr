package com.example.demo.Task10;

import org.springframework.stereotype.Component;

@Component
public class Kostya {
    private Lighter lighter;

    public Kostya(Lighter lighter) {
        this.lighter = lighter;
    }

    public void doFight(){
        System.out.println("I'n fighter");
    }
}

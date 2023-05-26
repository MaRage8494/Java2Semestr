package com.example.demo.Task10;

import org.springframework.stereotype.Component;

@Component("streetfighter")
public class StreetLighter implements Lighter {

    @Override
    public void doFight() {
        System.out.println("I'm a street fighter");
    }
}

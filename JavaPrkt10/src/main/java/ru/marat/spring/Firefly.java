package ru.marat.spring;

import org.springframework.stereotype.Component;

@Component
public class Firefly implements Lighter{
    public void doLight() {
        System.out.println("I'm Firefly");
    }
}
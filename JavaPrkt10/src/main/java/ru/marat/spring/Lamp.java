package ru.marat.spring;

import org.springframework.stereotype.Component;

@Component
public class Lamp implements Lighter{
    public void doLight() {
        System.out.println("I'm Lamp");
    }
}

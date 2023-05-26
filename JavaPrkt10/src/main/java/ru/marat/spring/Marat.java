package ru.marat.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Marat {
    private Lighter lighter1;
    private Lighter lighter2;
    private Lighter lighter3;

    @Autowired
    public Marat(@Qualifier("lamp") Lighter lighter, @Qualifier("flashlight") Lighter lighter2, @Qualifier("firefly") Lighter lighter3) {
        this.lighter1 = lighter;
        this.lighter2 = lighter2;
        this.lighter3 = lighter3;
    }

    public Lighter getLighter1() {
        return lighter1;
    }

    public void setLighter1(Lighter lighter1) {
        this.lighter1 = lighter1;
    }

    public Lighter getLighter2() {
        return lighter2;
    }

    public void setLighter2(Lighter lighter2) {
        this.lighter2 = lighter2;
    }

    public Lighter getLighter3() {
        return lighter3;
    }

    public void setLighter3(Lighter lighter3) {
        this.lighter3 = lighter3;
    }
}

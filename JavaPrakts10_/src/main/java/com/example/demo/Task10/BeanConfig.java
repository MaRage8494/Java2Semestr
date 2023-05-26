package com.example.demo.Task10;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean(name = "streetfighter")
    public Lighter streetfighter() {
        return new StreetLighter();
    }

    @Bean(name = "boxer")
    public Lighter boxer(){
        return new Boxer();
    }

    @Bean(name = "judoka")
    public Lighter judoka(){
        return new Judoka();
    }
}

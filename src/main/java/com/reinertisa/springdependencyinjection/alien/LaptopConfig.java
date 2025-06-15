package com.reinertisa.springdependencyinjection.alien;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class LaptopConfig {

    @Bean
    public Laptop laptop1() {
        return new Laptop("Apple", "Macbook Pro");
    }

    @Bean
    public Laptop laptop2() {
        return new Laptop("Lenovo", "Thinkpad");
    }

    @Bean
    public List<Laptop> laptopList(Laptop laptop1, Laptop laptop2) {
        return Arrays.asList(laptop1, laptop2);
    }
}

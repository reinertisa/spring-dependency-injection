package com.reinertisa.springdependencyinjection.alien;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Alien {

    private List<Laptop> laptops = new ArrayList<>();

    // Setter injection for Spring to inject the list
    @Autowired
    public void setLaptops(List<Laptop> laptops) {
        this.laptops = new ArrayList<>(laptops); // Copy for safety
    }

    public void addLaptop(Laptop laptop) {
        laptops.add(laptop);
    }

    public boolean removeLaptop(Laptop laptop) {
        return laptops.remove(laptop);
    }

    public void removeAllLaptops() {
        laptops.clear();
    }

    public void addAllLaptops(List<Laptop> laptopList) {
        laptops.addAll(laptopList);
    }

    public void showLaptops() {
        if (laptops.isEmpty()) {
            System.out.println("Alien has no laptops.");
        } else {
            System.out.println("Alien has the following laptops");
            laptops.forEach(System.out::println);
        }
    }
}

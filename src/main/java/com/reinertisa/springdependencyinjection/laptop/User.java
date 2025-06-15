package com.reinertisa.springdependencyinjection.laptop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("user")
public class User {
    private List<Laptop> laptops = new ArrayList<>();

    public void addLaptop(Laptop laptop) {
        laptops.add(laptop);
    }

    public void showLaptops() {
        System.out.println("User has the following laptops");
        laptops.forEach(System.out::println);
    }
}

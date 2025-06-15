package com.reinertisa.springdependencyinjection.laptop;

import org.springframework.stereotype.Component;

@Component(value = "dellLaptop")
public class DellLaptop extends Laptop {
    public DellLaptop() {
        super("Dell", "XPS 12");
    }
}

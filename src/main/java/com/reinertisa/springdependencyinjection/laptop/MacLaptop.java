package com.reinertisa.springdependencyinjection.laptop;

import org.springframework.stereotype.Component;

@Component
public class MacLaptop extends Laptop {
    public MacLaptop() {
        super("Apple", "Macbook Pro");
    }
}

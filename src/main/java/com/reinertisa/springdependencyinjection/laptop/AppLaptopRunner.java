package com.reinertisa.springdependencyinjection.laptop;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppLaptopRunner implements CommandLineRunner {

    private final User user;
    private final Laptop macLaptop;
    private final Laptop dellLaptop;

    public AppLaptopRunner(User user,
                           @Qualifier("macLaptop") Laptop macLaptop,
                           @Qualifier("dellLaptop") Laptop dellLaptop) {
        this.user = user;
        this.dellLaptop = dellLaptop;
        this.macLaptop = macLaptop;
    }

    @Override
    public void run(String... args) throws Exception {
        user.addLaptop(dellLaptop);
        user.addLaptop(macLaptop);
        user.showLaptops();
    }
}

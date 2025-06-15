package com.reinertisa.springdependencyinjection.alien;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppStartupRunner {

    @Bean
    public CommandLineRunner run(Alien alien) {
        return args -> {
            alien.showLaptops();

            // Add new one
            Laptop extra = new Laptop("Dell", "XPS 13");
            alien.addLaptop(extra);

            System.out.println("After adding Dell:");
            alien.showLaptops();
        };
    }
}

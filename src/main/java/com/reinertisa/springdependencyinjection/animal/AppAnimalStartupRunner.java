package com.reinertisa.springdependencyinjection.animal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppAnimalStartupRunner implements CommandLineRunner {

    private final AnimalService animalService;
    private final Cat cat;
    private final Dog dog;

    public AppAnimalStartupRunner(AnimalService animalService, Cat cat, Dog dog) {
        this.animalService = animalService;
        this.cat = cat;
        this.dog = dog;
    }

    @Override
    public void run(String... args) throws Exception {
        animalService.displayAnimalActions();

        cat.sound();

        dog.chase();
    }
}

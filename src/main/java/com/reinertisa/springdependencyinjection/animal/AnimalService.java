package com.reinertisa.springdependencyinjection.animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class AnimalService {
    private final Animal animal1;
    private final Animal animal2;

    @Autowired
    public AnimalService(@Qualifier("cat") Animal animal1, @Qualifier("dog") Animal animal2) {
        this.animal1 = animal1;
        this.animal2 = animal2;
    }

    public void displayAnimalActions() {
        animal1.breath();
        animal1.walk();

        animal2.walk();
        animal2.breath();
    }
}

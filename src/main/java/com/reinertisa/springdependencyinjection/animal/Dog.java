package com.reinertisa.springdependencyinjection.animal;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal {

    @Override
    public void walk() {
        System.out.println("Dog walks");
    }

    public void chase() {
        System.out.println("Dog chases birds");
    }
}

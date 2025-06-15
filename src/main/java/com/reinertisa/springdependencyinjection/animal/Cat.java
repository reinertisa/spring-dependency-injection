package com.reinertisa.springdependencyinjection.animal;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal {

    private Integer id;
    private String type;

    public Cat() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void walk() {
        System.out.println("Cat walks");
    }

    @Override
    public void breath() {
        System.out.println("Cat is breathing...");
    }

    public void sound() {
        System.out.println("Meow");
    }

}

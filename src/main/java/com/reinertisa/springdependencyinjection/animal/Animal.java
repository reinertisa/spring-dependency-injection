package com.reinertisa.springdependencyinjection.animal;

public interface Animal {
    void walk();

    static void eat() {
        System.out.println("Animal eats");
    }

    default void breath() {
        System.out.println("Animal breaths");
    }
}

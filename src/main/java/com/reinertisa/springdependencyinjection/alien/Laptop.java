package com.reinertisa.springdependencyinjection.alien;

public class Laptop {
    private String brand;
    private String model;

    public Laptop() {}

    public Laptop(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}

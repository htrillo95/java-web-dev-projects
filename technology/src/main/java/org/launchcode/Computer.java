package org.launchcode;

public class Computer /*extends AbstractEntity*/ {
    //properties
    private String brand;
    private String model;

    private double price;

    //constructor
    public Computer(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    //GETTER METHODS
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

}




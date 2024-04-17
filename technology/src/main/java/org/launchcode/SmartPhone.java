package org.launchcode;

public class SmartPhone extends Computer /*extends AbstractEntity*/{

    //additional property
    private int cameraResolution;

    //Constructor
    public SmartPhone(String brand,String model, double price, int cameraResolution) {
        super(brand, model, price); //super(); <-previously used before Abstraction
        this.cameraResolution = cameraResolution;
    }

    //GETTER METHOD


    public int getCameraResolution() {
        return cameraResolution;
    }
}

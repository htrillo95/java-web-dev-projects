package org.launchcode;

public class Laptop extends Computer /*extends AbstractEntity*/ {

    //additional property
    private double screenSize;

    //Constructor
    public Laptop(String brand, String model, double price, double screenSize){
        super(brand,model,price); /*<-previously used before abstractEntity*/
        this.screenSize = screenSize;
    }

    //GETTER

    public double getScreenSize() {
        return screenSize;
    }


}

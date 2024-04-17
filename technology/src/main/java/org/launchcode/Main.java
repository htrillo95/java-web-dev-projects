package org.launchcode;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Create Computer Object
        Computer computer = new Computer("Brand", "Model", 1300.00);

        //Computer Object Info
        System.out.println("Computer Info:");
        System.out.println("Brand: " + computer.getBrand());
        System.out.println("Model: " + computer.getModel());
        System.out.println("Price: $" + computer.getPrice());

        //Create Laptop Object
        Laptop laptop = new Laptop("Brand", "Model", 1600.00, 14.00);

        //Display Laptop Info
        System.out.println("\nLaptop Information:");
        System.out.println("Brand: " + laptop.getBrand());
        System.out.println("Model: " + laptop.getModel());
        System.out.println("Price: $" + laptop.getPrice());
        System.out.println("Screen Size: " + laptop.getScreenSize() + " inches");

        //Create SmartPhone Object
        SmartPhone smartphone = new SmartPhone("Brand", "Model", 999.99, 12);

        //Display SmartPhone Info
        System.out.println("\nSmartPhone Information:");
        System.out.println("Brand: " + smartphone.getBrand());
        System.out.println("Model: " + smartphone.getModel());
        System.out.println("Price: $" + smartphone.getPrice());
        System.out.println("Camera Resolution: " + smartphone.getCameraResolution() + " MP");
    }
}
//package org.launchcode;
//
//import java.time.LocalDate; //import LocalDate
//
//public class MenuItem {
//
//    //Declare private instance variables
//
//    private String name;
//    private String description;
//    private double price;
//    private String category;
//    private final LocalDate dateAdded; //marked final, cant  change
//
//    //java constructor - method
//    public MenuItem(String name, String description, double price, String category) {
//        this.name = name;
//        this.description = description;
//        this.price = price;
//        this.category = category;
//        this.dateAdded = LocalDate.now();
//    }
//
//    //GETTERS AND SETTERS
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }
//
//    public String getCategory() {
//        return category;
//    }
//
//    public void setCategory(String category) {
//        this.category = category;
//    }
//
//    //GETTER FOR LOCALDATE - DOESNT NEED SETTER - FINAL
//    public LocalDate getDateAdded() {
//        return dateAdded;
//    }
//}

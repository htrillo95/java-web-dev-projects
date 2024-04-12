package org.launchcode;

import javax.swing.*;

public class MenuItem {
    private double price; //stores price
    private String description; //stores description
    private String category; // stores category
    private boolean isNew; //new indicator

    public MenuItem(double p, String d, String c, boolean iN) {
        this.price = p;
        this.description = d;
        this.category = c;
        this.isNew = iN;
    }

        //GETTER FOR PRICE
        public double getPrice() {
            return price;
        }

        //SETTER FOR PRICE
        public void setPrice(double price) {
            this.price = price;
        }

        //GETTER FOR DESCRIPTION
        public String getDescription() {
            return description;
        }

        //SETTER FOR DESCRIPTION
        public void setDescription(String description) {
            this.description = description;
        }

        //GETTER FOR CATEGORY
        public String getCategory() {
            return category;
        }

        //SETTER FOR CATEGORY
        public void setCategory(String category) {
            this.category = category;
        }

        //GETTER FOR isNew
        public boolean isNew() {
            return isNew;
        }

        //SETTER FOR isNew
        public void setNew(boolean aNew) {
            isNew = aNew;
        }
    }
package org.launchcode;

import java.util.ArrayList;

    // MenuItem class
    public class MenuItem {
        // Instance variables
        private String name;
        private String description;
        private double price;
        private String category;

        // Constructor
        public MenuItem(String name, String description, double price, String category) {
            this.name = name;
            this.description = description;
            this.price = price;
            this.category = category;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

    }

    public class Menu {
        // Instance variables
        private ArrayList<MenuItem> menuItems = new ArrayList<>();

        // Default constructor

        // Getter for menuItems ArrayList
        public ArrayList<MenuItem> getMenuItems() {
            return menuItems;
        }

        // Method to add a MenuItem to the menu
        public void addMenuItem(MenuItem menuItem) {
            menuItems.add(menuItem);
        }
    }

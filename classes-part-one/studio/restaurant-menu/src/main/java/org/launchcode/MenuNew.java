package org.launchcode;

public class Main {
    public static void main(String[] args) {
        // Instantiate MenuItem objects for three menu items
        //MenuItem app1 = new MenuItem("Lentil Soup", "Red lentil, pita croutons, lemon wedges", 55, "Appetizer");
        MenuItem app2
        MenuItem starter1 = new MenuItem("LAMB SEEKH KEBAB (D)", "Minced Lamb, garam masala, homemade chutney", 95, "Starter");
        MenuItem desert1 = new MenuItem("CHEESE CAKE (D,G)", "Decadent fusion: cream cheese, eggs, sugar pure dessert delight", 50, "Dessert");

        // Create a Menu object
        Menu menu = new Menu();

        // Add the MenuItem objects to the Menu
        menu.addMenuItem(app1);
        menu.addMenuItem(starter1);
        menu.addMenuItem(desert1);
    }
}


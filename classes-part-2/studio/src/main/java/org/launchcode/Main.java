package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // write your code here

        // INSTANTIATE MenuItem objects for 3-6 menu items
        MenuItem app1 = new MenuItem(55.00, "Lentil Soup", "Appetizer", true);
        MenuItem app2 = new MenuItem(90.00, "CHICKEN 65 (G,D)", "Appetizer", true);
        MenuItem starter1 = new MenuItem(95.00, "LAMB SEEKH KEBAB (D)", "Starter", true);
        MenuItem starter2 = new MenuItem(65.00, "SAMOSA CHAT (V,G,D)", "Starter", true);
        MenuItem desert1 = new MenuItem(50.00, "CHEESE CAKE (D,G)", "Dessert", true);
        MenuItem desert2 = new MenuItem(65.00, "CHOCOLATE VOLCANO", "Dessert", true);

    //CREATE MENU OBJECT W CURRENT DATE
        Date currentDate = new Date();
        ArrayList<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(app1);
        menuItems.add(app2);
        menuItems.add(starter1);
        menuItems.add(starter2);
        menuItems.add(desert1);
        menuItems.add(desert2);
        Menu menu = new Menu(currentDate, menuItems);

        //TESTING ADD/REMOVE ITEMS
        menu.addItem(new MenuItem(75.00, "Garlic Bread", "Appetizer", true));
        menu.removeItem(starter2);


        //DISPLAY MENU
        System.out.println("Menu last updated: " + menu.getLastUpdated());
        System.out.println("Menu Items:");
        for (MenuItem items : menu.getItems()) {
            System.out.println(items.getDescription() + " - $" + items.getPrice());
        }
    }
}

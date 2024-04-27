package org.launchcode;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.
        //to sort the flavors list, first create a new FlavorComparator object.
        Comparator comparator = new FlavorComparator();
        //Next, call the sort method on flavors and pass the comparator object as the argument.
        flavors.sort(new FlavorComparator());

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.
        Comparator<Cone> coneComparator = new ConeComparator();
        cones.sort(coneComparator);


        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
        System.out.println("\nSorted Flavors:");
        for (Flavor flavor : flavors) {
            System.out.println(flavor.getName());
        }

        System.out.println("\nSorted Cones:");
        for (Cone cone : cones) {
            System.out.println(cone.getName() + ": $" + cone.getCost());

            System.out.println("\nSorted Flavors by Allergens:");
            for (Flavor flavor : flavors) {
                System.out.println(flavor.getName() + ": " + flavor.getAllergens().size() + " allergens");

            }
        }
    }
}
package org.launchcode;

import java.util.Comparator;

public class FlavorComparator implements Comparator<Flavor> {
    @Override
    public int compare(Flavor o1, Flavor o2) {

        // Compare flavors based on the number of allergens
        int allergensComparison = Integer.compare(o2.getAllergens().size(), o1.getAllergens().size());

        // If the number of allergens is the same, compare flavors alphabetically by name
        if (allergensComparison == 0) {
            return o1.getName().compareTo(o2.getName());
        }

        // Return comparison result based on the number of allergens
        return allergensComparison;

//        return o1.getName().compareTo(o2.getName());
    }
}

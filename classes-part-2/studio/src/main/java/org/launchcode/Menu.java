package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items; //storing menu items

    public Menu(Date lastUpdated, ArrayList<MenuItem> items) {
        this.lastUpdated = lastUpdated;
        this.items = items;
    }

    //GETTERS & SETTERS
    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }


    //METHOD ADDS NEW ITEMS TO MENU
    public void addItem(MenuItem item) {

        if (!items.contains(item)) {
            items.add(item);

            setLastUpdated(new Date());
        } else {
            System.out.println("ITEM EXISTS ALREADY ON MENU!");

        }
    }


    //METHOD REMOVES ITEM FROM MENU

    public void removeItem(MenuItem item) {
        items.remove(items);


        //UPDATES LAST UPDATED DATE
        setLastUpdated(new Date());
    }

    //METHOD CHECKS IS MENU IS EMPTY
    public boolean isEmpty() {
        return items.isEmpty();
    }
}

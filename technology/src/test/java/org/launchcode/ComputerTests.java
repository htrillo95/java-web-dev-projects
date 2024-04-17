package org.launchcode;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ComputerTests {


    @Test
    public void testConstructor() {
        Computer computer = new Computer("Dell", "XPS", 1200.00);
        assertEquals("Dell", computer.getBrand());
        assertEquals("XPS", computer.getModel());
        assertEquals(1200.0, computer.getPrice());

//        assertNotEquals(computer1.getId(), computer2.getId()); <- USED FOR ABSTRACTION-- FAILED
    }

    @Test
    public void testGetBrand() {
        Computer computer = new Computer("Apple", "Macbook Pro", 1600.0);
        assertEquals("Apple", computer.getBrand());
    }

    @Test
    public void testGetModel() {
        Computer computer = new Computer("HP", "CorsairOne", 3000.0);
        assertEquals("CorsairOne", computer.getModel());
    }


}

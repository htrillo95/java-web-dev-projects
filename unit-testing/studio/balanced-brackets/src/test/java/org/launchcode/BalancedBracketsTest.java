package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here

    @Test
    public void onlyBracketsReturnTrue() {
        String message = "single set of brackets returns true";
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    //Test "[]Launchcode"
    @Test
    public void singleBracketsBeforeOtherCharacters() {
        String message = "balanced brackets in front return true";
        String testData = "[]LaunchCode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }

    //Test "[Launchcode]"
    @Test
    public void singleBracketsAroundOtherCharacters() {
        String message = "balanced brackets around other chars returns true";
        String testData = "[LaunchCode]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }

    //Test Launch[Code]"
    @Test
    public void singleBracketsAmongOtherCharacters() {
        String message = "balanced brackets among other chars returns true";
        String testData = "Launch[Code]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }

    //Test "[][][]"
    @Test
    public void tripleBalancedBrackets() {
        String message = "three pairs balanced brackets returns true";
        String testData = "[][][]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }

    //Test "[[[]]]"
    @Test
    public void tripleNestedBalancedBrackets() {
        String message = "three nested pairs of balanced brackets returns true";
        String testData = "[[[]]]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }

    //Test "["
    @Test
    public void singleOpeningBracket() {
        String message = "single opening bracket returns false";
        String testData = "[";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
    }

    //Test "]"
    @Test
    public void singleClosingBracket() {
        String message = "single closing bracket returns false";
        String testData = "]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
    }

    //Test "]["
    @Test
    public void reservedBracket() {
        String message = "reversed bracket returns false";
        String testData = "][";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
    }
    

    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
}


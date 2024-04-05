package org.launchcode;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class CharacterCounter {

    public static void main(String[] args) {
        //scanner input
        Scanner scanner = new Scanner(System.in);
        //enter string
        System.out.println("Enter a string: ");
        //stores in "inputString" variable
        String inputString = scanner.nextLine();
        //converts to lowercase
        inputString = inputString.toLowerCase();
        //creates HashMap storing character counts
        HashMap<Character, Integer> characterCounts = new HashMap<>();

        //iterates over Characters in string
        for (char character : inputString.toCharArray()) {
            //checks if Character is alphabetic
            if (Character.isAlphabetic(character)) {
                //if counted once already: increment count by 1,
                //if not counted: add Character count of 1
                characterCounts.put(character, characterCounts.getOrDefault(character, 0) + 1);
            }
        }
        //prints to console
        System.out.println("Character Counts:");
        for (Map.Entry<Character, Integer> entry : characterCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

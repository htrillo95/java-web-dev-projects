package exercise.alice;

import java.util.Scanner;

public class AliceString {

    public static void main(String[] args) {
        // Store the provided sentence in a string
        String aliceSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice " +
                "'without pictures or conversation?'";

        Scanner input = new Scanner(System.in);

        // Prompt the user for a search term
        System.out.print("Enter a term to search for: ");
        String searchTerm = input.nextLine().toLowerCase();  // Convert the search term to lowercase for case-insensitive search

        // Perform case-insensitive search using contains() method
        boolean found = aliceSentence.toLowerCase().contains(searchTerm);

        // Print whether the search term was found or not
        if (found) {
            // Calculate index and length of the search term
            Integer index = aliceSentence.toLowerCase().indexOf(searchTerm);
            Integer length = searchTerm.length();
            System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");

            // Remove the word from the sentence and print the modified sentence
            String modifiedSentence = aliceSentence.replace(searchTerm, "");
            System.out.println(modifiedSentence);  // Print the modified sentence without the search term
        } else {
            System.out.println("Search term '" + searchTerm + "' not found.");
        }


        // Print whether the search term was found or not
        //System.out.println("Search term '" + searchTerm + "' found: " + found);

        input.close(); // Close the scanner

    }
}
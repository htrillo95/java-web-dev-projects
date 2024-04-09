package org.launchcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
    }

    public static void Divide(int x, int y)
    {
        // Write code here!
    }

    public static int CheckFileExtension(String fileName)
    {
        // Write code here!
    }

    public static class ArrayListPractice {
        public static void main(String[] args) {
            // Create an ArrayList with at least 10 integers
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = 1; i <= 10; i++) {
                numbers.add(i * 2); // Adding even numbers from 2 to 20
            }

            // Call the sumEven method and print the result
            int sumOfEvens = sumEven(numbers);
            System.out.println("Sum of even numbers: " + sumOfEvens);

            // Create an ArrayList with some words
            ArrayList<String> wordsList = new ArrayList<>();
            wordsList.add("apple");
            wordsList.add("banana");
            wordsList.add("grape");
            wordsList.add("melon");
            wordsList.add("peach");
            wordsList.add("lemon");

            // Prompt the user to enter the word length for the search
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a word length: ");
            int numChars = input.nextInt();

            // Call the printWordsWithLength method with the user-input length
            printWordsWithLength(wordsList, numChars);

            input.close(); // Close the scanner
        }

        public static int sumEven(ArrayList<Integer> arr) { //iterates through arraylist adds even numbers
            int total = 0;
            for (int integer : arr) {
                if (integer % 2 == 0) {
                    total += integer;
                }
            }
            return total;
        }

        public static void printWordsWithLength(ArrayList<String> words, int length) {
            System.out.println("Words with length " + length + ":");
            for (String word : words) {
                if (word.length() == length) {
                    System.out.println(word);
                }
            }
        }
    }
}
//import java.util.Arrays;  // Import the Arrays class from java.util
//public class ArrayPractice {
//
//    public static void main(String[] args) {
//        // Create and initialize the array in a single line
//        int[] integerArray = {1, 1, 2, 3, 5, 8};
//
//        // Print the array elements to verify the initialization
//        System.out.println("All elements of the array:");
//        for (int num : integerArray) {
//            System.out.println(num);
//        }
//
//        // Print only the odd numbers in the array
//        System.out.println("\nOdd numbers in the array:");
//        for (int num : integerArray) {
//            if (num % 2 != 0) {  // Check if the number is odd
//                System.out.println(num);
//            }
//        }
//
//        // Split a string into words and print the words
//        System.out.println("\nSplitting a string into words:");
//        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
//        String[] words = phrase.split(" ");
//        System.out.println(Arrays.toString(words));
//
//        // Split the string into sentences and print the sentences
//        System.out.println("\nSplitting a string into sentences:");
//        String[] sentences = phrase.split("\\.");  // Escape the period using double backslashes
//        System.out.println(Arrays.toString(sentences));
//
//    }
//}

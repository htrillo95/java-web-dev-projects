package exercise.areaofrectangle;

import java.util.Scanner;
public class Rectangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for length
        System.out.print("Enter the length of the rectangle: ");
        double length = input.nextDouble();

        // Prompt the user for width
        System.out.print("Enter the width of the rectangle: ");
        double width = input.nextDouble();

        // Calculate the area
        double area = calculateArea(length, width);

        // Print the result
        System.out.println("The area of the rectangle is: " + area);

        input.close(); // Close the scanner
    }

    public static double calculateArea(double length, double width) {
        return length * width;
    }

}

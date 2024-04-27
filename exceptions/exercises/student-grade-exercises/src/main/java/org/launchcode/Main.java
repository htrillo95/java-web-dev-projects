package org.launchcode;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function! ADDED CODE HERE PART 1:

        try {
            int result = Divide(10,2); //CHANGED y:0 to y:2
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }



        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function! PART 2/2nd HALF DONE HERE
        for (Map.Entry<String,String> entry : studentFiles.entrySet()) {
            String studentName = entry.getKey();
            String fileName = entry.getValue();
            try {
                int points = CheckFileExtension(fileName);
                System.out.println(studentName + ": " + points + " points");
            } catch (IllegalArgumentException e) {
                System.out.println(studentName + ": Error - " + e.getMessage());
            }
        }
    }

    public static int Divide(int x, int y) //switch from VOID to INT
    {
        // Write code here! PART 1 CONTINUED...
        if (y == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return x / y;

    }

    public static int CheckFileExtension(String fileName) {

        // Write code here! PART 2 STARTS HERE!
        if (fileName == null || fileName.isEmpty()) {
            throw new IllegalArgumentException("File name cannot be null/empty.. ");
        }

        //PREVIOUSLY GIVEN
        if (fileName.endsWith(".java")) {
            return 1;
        } else {

            return 0;
        }
    }
}

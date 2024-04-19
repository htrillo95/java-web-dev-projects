package org.launchcode;

public class QuizRunner {


    public static void main(String[] args) {
        // Create a quiz object
        Quiz quiz = new Quiz();

        // Add questions to the quiz
        // Example:
        List<String> choices = Arrays.asList("A", "B", "C", "D"); // Example choices for a multiple-choice question
         quiz.addQuestion(new MultipleChoice("What is the capital of France?", choices, correctAnswerIndex));

        // Run the quiz
         quiz.runQuiz();

        // Grade the quiz
         int score = quiz.gradeQuiz();

        // Display the result to the user
         System.out.println("Your score: " + score + " out of " + totalQuestions);
    }
}

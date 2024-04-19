package org.launchcode;



















//
//import java.util.List;
//import java.util.Scanner;
//
//
//public class MultipleChoice extends Question {
//
//
//    private List<String> choices;
//    private int correctAnswer;
//
//    public MultipleChoice(String text, List<String> choices, int correctAnswer) {
//        super(text);
//        this.choices = choices;
//        this.correctAnswer = correctAnswer;
//    }
//
//    public void display() {
//        System.out.println(text);
//        for (int i = 0; i < choices.size(); i++) {
//            System.out.printf(( i + 1) + ". " + choices.get(i));
//        }
//    }
//
//    public boolean checkAnswer() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter your answer (1-" + choices.size() + "): ");
//        int userAnswer = scanner.nextInt();
//        isCorrect = userAnswer - 1 == correctAnswer;
//        return false;
//    }
//}

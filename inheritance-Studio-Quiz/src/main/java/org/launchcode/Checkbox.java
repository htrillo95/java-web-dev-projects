package org.launchcode;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Checkbox extends Question {

    private List<String> choices;
    private List<Integer> correctAnswers;

    public Checkbox(String text, List<String> choices, List<Integer> correctAnswers) {
        super(text);
        this.choices = choices;
        this.correctAnswers = correctAnswers;
    }

    public void display() {
        System.out.println(text);
        for (int i = 0; i < choices.size(); i++) {
            System.out.printf(( i + 1) + ". " + choices.get(i));
        }
    }

    public boolean checkAnswer(String userResponse) {
        // Split the user response into individual answer indices
        String[] responseArray = userResponse.split(",");
        List<Integer> userAnswers = new ArrayList<>();
        for (String response : responseArray) {
            userAnswers.add(Integer.parseInt(response));
        }

        if (userAnswers.size() != correctAnswers.size()) {
            return false; // If number of user answers doesn't match correct answers, it's incorrect
        }
        for (int answer : userAnswers) {
            if (!correctAnswers.contains(answer)) {
                return false; // If user answer is not in the list of correct answers, it's incorrect
            }
        }
        return true; // All user answers are correct
    }
}

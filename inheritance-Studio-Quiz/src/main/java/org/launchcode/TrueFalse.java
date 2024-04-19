package org.launchcode;

public class TrueFalse extends Question{

    private boolean correctAnswer;

    public TrueFalse(String text, boolean correctAnswer) {
        super(text);
        this.correctAnswer = correctAnswer;
    }

    @Override
    public boolean checkAnswer(String userResponse) {
        return userResponse.equalsIgnoreCase("true") == correctAnswer;
    }


}

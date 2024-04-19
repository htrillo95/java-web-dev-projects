package org.launchcode;

public abstract class Question {

    protected String text;
    protected boolean isCorrect;

    //stores text
    public Question(String text) {
        this.text = text;
    }


    public String getText() {
        return text;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    //implemented by sub class
    public abstract boolean checkAnswer(String userResponse);

}

package com.example.dzandroidl3;
import java.io.Serializable;
public class QuestionModel implements Serializable{
    private String currentLevel;
    private String questions;
    private String answer;
    private String firstVariant;
    private String secondVariant;
    private String thirdVariant;
    private String fourVariant;

    public QuestionModel(String currentLevel, String questions, String answer, String firstVariant, String secondVariant, String thirdVariant, String fourVariant) {
        this.currentLevel = currentLevel;
        this.questions = questions;
        this.answer = answer;
        this.firstVariant = firstVariant;
        this.secondVariant = secondVariant;
        this.thirdVariant = thirdVariant;
        this.fourVariant = fourVariant;
    }

    public String getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(String currentLevel) {
        this.currentLevel = currentLevel;
    }

    public String getQuestions() {
        return questions;
    }

    public void setQuestions(String questions) {
        this.questions = questions;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getFirstVariant() {
        return firstVariant;
    }

    public void setFirstVariant(String firstVariant) {
        this.firstVariant = firstVariant;
    }

    public String getSecondVariant() {
        return secondVariant;
    }

    public void setSecondVariant(String secondVariant) {
        this.secondVariant = secondVariant;
    }

    public String getThirdVariant() {
        return thirdVariant;
    }

    public void setThirdVariant(String thirdVariant) {
        this.thirdVariant = thirdVariant;
    }

    public String getFourVariant() {
        return fourVariant;
    }

    public void setFourVariant(String fourVariant) {
        this.fourVariant = fourVariant;
    }
}

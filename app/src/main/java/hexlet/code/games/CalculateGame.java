package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;

public class CalculateGame {
    public static void startCalculateGame() {
        final int maxValueOfNum = 20;
        final int maxValueOfSign = 3;
        int choiceOfSign;
        int num1;
        int num2;
        String[] questions = new String[App.getRequiredScoreOfCorrectAnswers()];
        String[] correctAnswers = new String[App.getRequiredScoreOfCorrectAnswers()];

        for (int i = 0; i < App.getRequiredScoreOfCorrectAnswers(); i++) {
            choiceOfSign = (int) (Math.random() * maxValueOfSign);
            num1 = (int) (Math.random() * maxValueOfNum) + 1;
            num2 = (int) (Math.random() * maxValueOfNum) + 1;
            setQuestionsAndAnswers(questions, correctAnswers, i, choiceOfSign, num1, num2);
        }
        System.out.println("What is the result of the expression?");
        Engine.startEngine(questions, correctAnswers);
    }

    private static void setQuestionsAndAnswers(String[] questions, String[] correctAnswers,
                                               int index, int choiceOfSign, int num1, int num2) {
        String question;
        String answer;
        if (choiceOfSign == 0) {
            question = num1 + " + " + num2;
            answer = String.valueOf(num1 + num2);
        } else if (choiceOfSign == 1) {
            question =  num1 + " - " + num2;
            answer = String.valueOf(num1 - num2);
        } else {
            question =  num1 + " * " + num2;
            answer = String.valueOf(num1 * num2);
        }
        questions[index] = question;
        correctAnswers[index] = answer;
    }

}

package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;

import static java.lang.System.out;

public class GCDGame {
    public static void startGCDGame() {
        final int maxValueOfNum = 20;
        int num1;
        int num2;
        String[] questions = new String[App.getRequiredScoreOfCorrectAnswers()];
        String[] correctAnswers = new String[App.getRequiredScoreOfCorrectAnswers()];

        for (int i = 0; i < App.getRequiredScoreOfCorrectAnswers(); i++) {
            num1 = (int) (Math.random() * maxValueOfNum) + 1;
            num2 = (int) (Math.random() * maxValueOfNum) + 1;
            questions[i] = "Question: " + num1 + " " + num2;
            correctAnswers[i] = String.valueOf(getCorrectAnswer(num1, num2));
        }
        out.println("Find the greatest common divisor of given numbers.");
        Engine.startEngine(questions, correctAnswers);
    }

    private static int getCorrectAnswer(int num1, int num2) {
        return (num1 % num2 == 0) ? Math.abs(num2) : getCorrectAnswer(num2, num1 % num2);
    }
}

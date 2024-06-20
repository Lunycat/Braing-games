package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;

public class EvenGame {
    public static void startEvenGame() {
        final int maxValueOfNum = 20;
        String[] questions = new String[App.getRequiredScoreOfCorrectAnswers()];
        String[] correctAnswers = new String[App.getRequiredScoreOfCorrectAnswers()];

        for (int i = 0; i < App.getRequiredScoreOfCorrectAnswers(); i++) {
            questions[i] = String.valueOf((int) (Math.random() * maxValueOfNum) + 1);
            correctAnswers[i] = getCorrectAnswer(questions[i]);
        }
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Engine.startEngine(questions, correctAnswers);
    }

    private static String getCorrectAnswer(String questions) {
        return Integer.parseInt(questions) % 2 == 0 ? "yes" : "no";
    }
}

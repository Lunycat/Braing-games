package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;

public class PrimeGame {
    public static void startPrimeGame() {
        final int maxValueOfNum = 1000;
        String[] questions = new String[App.getRequiredScoreOfCorrectAnswers()];
        String[] correctAnswers = new String[App.getRequiredScoreOfCorrectAnswers()];

        for (int i = 0; i < App.getRequiredScoreOfCorrectAnswers(); i++) {
            questions[i] = String.valueOf((int) (Math.random() * maxValueOfNum));
            correctAnswers[i] = getCorrectAnswer(questions[i]);
        }
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        Engine.startEngine(questions, correctAnswers);
    }

    private static String getCorrectAnswer(String num) {
        int numInt = Integer.parseInt(num);
        for (int i = 2; i <= Math.sqrt(numInt); i++) {
            if (numInt % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}

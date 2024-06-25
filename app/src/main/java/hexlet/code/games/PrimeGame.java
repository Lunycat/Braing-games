package hexlet.code.games;

import hexlet.code.Engine;

public class PrimeGame {
    private static final int MAX_VALUE_OF_NUM = 1000;

    public static void startPrimeGame() {
        String[] questions = new String[Engine.REQUIRED_SCORE_OF_CORRECT_ANSWERS];
        String[] correctAnswers = new String[Engine.REQUIRED_SCORE_OF_CORRECT_ANSWERS];

        for (int i = 0; i < Engine.REQUIRED_SCORE_OF_CORRECT_ANSWERS; i++) {
            questions[i] = String.valueOf((int) (Math.random() * MAX_VALUE_OF_NUM));
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

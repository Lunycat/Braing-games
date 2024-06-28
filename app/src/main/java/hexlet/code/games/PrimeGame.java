package hexlet.code.games;

import hexlet.code.Engine;

public class PrimeGame {
    private static final int MAX_VALUE_OF_NUM = 1000;
    private static final String RULES_OF_GAME = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void startPrimeGame() {
        String[][] questionsAndCorrectAnswers =
                new String[Engine.REQUIRED_SCORE_OF_CORRECT_ANSWERS][Engine.PAIR_OF_QUESTION_AND_ANSWER];

        for (int i = 0; i < Engine.REQUIRED_SCORE_OF_CORRECT_ANSWERS; i++) {
            questionsAndCorrectAnswers[i][0] = String.valueOf((int) (Math.random() * MAX_VALUE_OF_NUM));
            questionsAndCorrectAnswers[i][1] = isPrime(questionsAndCorrectAnswers[i][0]) ? "yes" : "no";
        }
        Engine.startEngine(questionsAndCorrectAnswers, RULES_OF_GAME);
    }

    private static boolean isPrime(String num) {
        int numInt = Integer.parseInt(num);
        for (int i = 2; i <= Math.sqrt(numInt); i++) {
            if (numInt % i == 0) {
                return false;
            }
        }
        return true;
    }
}

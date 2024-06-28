package hexlet.code.games;

import hexlet.code.Engine;

public class GCDGame {
    private static final int MAX_VALUE_OF_NUM = 20;
    private static final String RULES_OF_GAME = "Find the greatest common divisor of given numbers.";

    public static void startGCDGame() {
        String[][] questionsAndCorrectAnswers =
                new String[Engine.REQUIRED_SCORE_OF_CORRECT_ANSWERS][Engine.PAIR_OF_QUESTION_AND_ANSWER];

        for (int i = 0; i < Engine.REQUIRED_SCORE_OF_CORRECT_ANSWERS; i++) {
            int num1 = (int) (Math.random() * MAX_VALUE_OF_NUM) + 1;
            int num2 = (int) (Math.random() * MAX_VALUE_OF_NUM) + 1;
            questionsAndCorrectAnswers[i][0] = String.format("%d %d", num1, num2);
            questionsAndCorrectAnswers[i][1] = String.valueOf(getCorrectAnswer(num1, num2));
        }
        Engine.startEngine(questionsAndCorrectAnswers, RULES_OF_GAME);
    }

    private static int getCorrectAnswer(int num1, int num2) {
        return (num1 % num2 == 0) ? Math.abs(num2) : getCorrectAnswer(num2, num1 % num2);
    }
}

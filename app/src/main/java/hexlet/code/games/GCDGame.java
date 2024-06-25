package hexlet.code.games;

import hexlet.code.Engine;

public class GCDGame {
    private static final int MAX_VALUE_OF_NUM = 20;

    public static void startGCDGame() {
        int num1;
        int num2;
        String[][] questionsAndCorrectAnswers =
                new String[Engine.REQUIRED_SCORE_OF_CORRECT_ANSWERS][Engine.PAIR_OF_QUESTION_AND_ANSWER];

        for (int i = 0; i < Engine.REQUIRED_SCORE_OF_CORRECT_ANSWERS; i++) {
            num1 = (int) (Math.random() * MAX_VALUE_OF_NUM) + 1;
            num2 = (int) (Math.random() * MAX_VALUE_OF_NUM) + 1;
            questionsAndCorrectAnswers[i][0] = String.format("%d %d", num1, num2);
            questionsAndCorrectAnswers[i][1] = String.valueOf(getCorrectAnswer(num1, num2));
        }
        System.out.println("Find the greatest common divisor of given numbers.");
        Engine.startEngine(questionsAndCorrectAnswers);
    }

    private static int getCorrectAnswer(int num1, int num2) {
        return (num1 % num2 == 0) ? Math.abs(num2) : getCorrectAnswer(num2, num1 % num2);
    }
}

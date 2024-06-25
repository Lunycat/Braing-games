package hexlet.code.games;

import hexlet.code.Engine;

public class EvenGame {
    private static final int MAX_VALUE_OF_NUM = 20;

    public static void startEvenGame() {
        String[] questions = new String[Engine.REQUIRED_SCORE_OF_CORRECT_ANSWERS];
        String[] correctAnswers = new String[Engine.REQUIRED_SCORE_OF_CORRECT_ANSWERS];

        for (int i = 0; i < Engine.REQUIRED_SCORE_OF_CORRECT_ANSWERS; i++) {
            questions[i] = String.valueOf((int) (Math.random() * MAX_VALUE_OF_NUM) + 1);
            correctAnswers[i] = isEven(questions[i]) ? "yes" : "no";
        }
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Engine.startEngine(questions, correctAnswers);
    }

    private static boolean isEven(String questions) {
        return Integer.parseInt(questions) % 2 == 0;
    }
}

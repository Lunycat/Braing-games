package hexlet.code.games;

import hexlet.code.Engine;

public class CalculateGame {
    private static final int MAX_VALUE_OF_NUM = 20;
    private static final int MAX_VALUE_OF_SIGN = 3;
    private static final String RULES_OF_GAME = "What is the result of the expression?";

    public static void startCalculateGame() {
        String[][] questionsAndCorrectAnswers =
                new String[Engine.REQUIRED_SCORE_OF_CORRECT_ANSWERS][Engine.PAIR_OF_QUESTION_AND_ANSWER];

        for (int i = 0; i < Engine.REQUIRED_SCORE_OF_CORRECT_ANSWERS; i++) {
            int choiceOfSign = (int) (Math.random() * MAX_VALUE_OF_SIGN);
            int num1 = (int) (Math.random() * MAX_VALUE_OF_NUM) + 1;
            int num2 = (int) (Math.random() * MAX_VALUE_OF_NUM) + 1;
            String operator = getOperator(choiceOfSign);
            questionsAndCorrectAnswers[i][0] = getQuestion(num1, operator, num2);
            questionsAndCorrectAnswers[i][1] = String.valueOf(getCorrectAnswer(num1, operator, num2));
        }
        Engine.startEngine(questionsAndCorrectAnswers, RULES_OF_GAME);
    }

    private static String getOperator(int choiceOfSign) {
        String[] operators = new String[]{"+", "-", "*"};
        return operators[choiceOfSign];
    }

    private static String getQuestion(int num1, String operator, int num2) {
        return String.format("%d %s %d", num1, operator, num2);
    }

    private static int getCorrectAnswer(int num1, String operator, int num2) {
        switch (operator) {
            case "+" -> {
                return num1 + num2;
            }
            case "-" -> {
                return num1 - num2;
            }
            case "*" -> {
                return num1 * num2;
            }
            default -> {
                return -1;
            }
        }
    }
}

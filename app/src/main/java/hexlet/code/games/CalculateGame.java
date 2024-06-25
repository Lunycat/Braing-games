package hexlet.code.games;

import hexlet.code.Engine;

public class CalculateGame {
    private static final int MAX_VALUE_OF_NUM = 20;
    private static final int MAX_VALUE_OF_SIGN = 3;

    public static void startCalculateGame() {
        int choiceOfSign;
        int num1;
        int num2;
        String operator;
        String[] questions = new String[Engine.REQUIRED_SCORE_OF_CORRECT_ANSWERS];
        String[] correctAnswers = new String[Engine.REQUIRED_SCORE_OF_CORRECT_ANSWERS];
        String[][] questionsAndCorrectAnswers = new String[Engine.REQUIRED_SCORE_OF_CORRECT_ANSWERS][];

        for (int i = 0; i < Engine.REQUIRED_SCORE_OF_CORRECT_ANSWERS; i++) {
            choiceOfSign = (int) (Math.random() * MAX_VALUE_OF_SIGN);
            num1 = (int) (Math.random() * MAX_VALUE_OF_NUM) + 1;
            num2 = (int) (Math.random() * MAX_VALUE_OF_NUM) + 1;
            operator = getOperator(choiceOfSign);
            questionsAndCorrectAnswers[i][0] = getQuestion(num1, operator, num2);
            questionsAndCorrectAnswers[i][1] = getCorrectAnswer(num1, operator, num2);
            correctAnswers[i] = getCorrectAnswer(num1, operator, num2);
            questions[i] = getQuestion(num1, operator, num2);
        }
        System.out.println("What is the result of the expression?");
        Engine.startEngine(questions, correctAnswers);
    }

    private static String getOperator(int choiceOfSign) {
        String[] operators = new String[]{"+", "-", "*"};
        return operators[choiceOfSign];
    }

    private static String getQuestion(int num1, String operator, int num2) {
        return String.format("%d %s %d", num1, operator, num2);
    }

    private static String getCorrectAnswer(int num1, String operator, int num2) {
        switch (operator) {
            case "+" -> {
                return String.valueOf(num1 + num2);
            }
            case "-" -> {
                return String.valueOf(num1 - num2);
            }
            case "*" -> {
                return String.valueOf(num1 * num2);
            }
            default -> {
                return "Error";
            }
        }
    }
}

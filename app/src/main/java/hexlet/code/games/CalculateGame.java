package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;
import static java.lang.System.out;

public class CalculateGame {
    public static void startCalculateGame() {
        int choiceOfSign;
        int num1;
        int num2;

        out.println("What is the result of the expression?");
        while (App.getCountCorrectAnswer() < App.getRequiredScoreOfCorrectAnswers()) {
            final int maxValueOfNum = 20;
            final int maxValueOfSign = 3;
            choiceOfSign = (int) (Math.random() * maxValueOfSign);
            num1 = (int) (Math.random() * maxValueOfNum) + 1;
            num2 = (int) (Math.random() * maxValueOfNum) + 1;

            if (choiceOfSign == 0) {
                App.setCorrectAnswer(String.valueOf(num1 + num2));
                out.printf("Question: %d + %d\n", num1, num2);
            } else if (choiceOfSign == 1) {
                App.setCorrectAnswer(String.valueOf(num1 - num2));
                out.printf("Question: %d - %d\n", num1, num2);
            } else {
                App.setCorrectAnswer(String.valueOf(num1 * num2));
                out.printf("Question: %d * %d\n", num1, num2);
            }
            Engine.checkAnswer();
        }
        Engine.printEnd();
    }
}

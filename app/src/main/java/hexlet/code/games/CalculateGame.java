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
        while (App.countCorrectAnswer < 3) {
            choiceOfSign = (int) (Math.random() * 3);
            num1 = (int) (Math.random() * 20) + 1;
            num2 = (int) (Math.random() * 20) + 1;
            if (choiceOfSign == 0) {
                App.correctAnswer = String.valueOf(num1 + num2);
                out.printf("Question: %d + %d\n", num1, num2);
            } else if (choiceOfSign == 1) {
                App.correctAnswer = String.valueOf(num1 - num2);
                out.printf("Question: %d - %d\n", num1, num2);
            } else {
                App.correctAnswer = String.valueOf(num1 * num2);
                out.printf("Question: %d * %d\n", num1, num2);
            }
            Engine.checkAnswer();
        }
        Engine.printEnd();
    }
}

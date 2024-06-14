package hexlet.code.games;

import hexlet.code.App;

import java.util.Scanner;

import static java.lang.System.out;
import static java.lang.System.in;

public class CalculateGame {
    public static void startCalculateGame() {
        Scanner sc = new Scanner(in);
        int selectionAnswer;
        int choiceOfSign, num1, num2;
        int correctAnswer;
        int countCorrectAnswer = 0;

        out.println("What is the result of the expression?");
        while (countCorrectAnswer != 3) {
            choiceOfSign = (int)(Math.random() * 3);
            num1 = (int)(Math.random() * 20) + 1;
            num2 = (int)(Math.random() * 20) + 1;
            if (choiceOfSign == 0) {
                correctAnswer = num1 + num2;
                out.printf("Question: %d + %d\n", num1, num2);
            } else if (choiceOfSign == 1) {
                correctAnswer = num1 - num2;
                out.printf("Question: %d - %d\n", num1, num2);
            } else {
                correctAnswer = num1 * num2;
                out.printf("Question: %d * %d\n", num1, num2);
            }
            out.print("Your answer: ");
            selectionAnswer = sc.nextInt();

            if (correctAnswer == selectionAnswer) {
                out.println("Correct!");
                countCorrectAnswer++;
            } else {
                out.printf("'%s' is wrong answer ;(. "
                        + "Correct answer was '%s'\n", selectionAnswer, correctAnswer);
                break;
            }
        }
        if (countCorrectAnswer == 3) {
            out.printf("Congratulations, %s!\n", App.userName);
        } else {
            out.printf("Let's try again, %s!\n", App.userName);
        }
    }
}

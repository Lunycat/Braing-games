package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class EvenGame {
    static void startEvenGame() {
        Scanner sc = new Scanner(System.in);
        String selectionAnswer;
        int countCorrectAnswer = 0;

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        while (countCorrectAnswer != 3) {
            System.out.print("Question: ");
            selectionAnswer = sc.next();
            System.out.println("Your answer: " + selectionAnswer);

            if (Integer.parseInt(selectionAnswer) % 2 == 0 && selectionAnswer.equals("yes")
                    || Integer.parseInt(selectionAnswer) % 2 != 0 && selectionAnswer.equals("no")) {
                System.out.println("Correct!");
                countCorrectAnswer++;
            } else {
                String correctAnswer = Integer.parseInt(selectionAnswer) % 2 == 0 ? "yes" : "no";
                System.out.printf("'%s' is wrong answer ;(. "
                        + "Correct answer was '%s'\n", selectionAnswer, correctAnswer);
                System.out.println("Let's try again, " + App.userName);
                break;
            }
        }
    }
}

package hexlet.code.games;

import hexlet.code.App;
import java.util.Scanner;
import static java.lang.System.out;

public class EvenGame {
    public static void startEvenGame() {
        Scanner sc = new Scanner(System.in);
        String selectionAnswer;
        String correctAnswer;
        int countCorrectAnswer = 0;
        int randomNum;

        out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        while (countCorrectAnswer != 3) {
            randomNum = (int) (Math.random() * 10) + 1;
            correctAnswer = randomNum % 2 == 0 ? "yes" : "no";
            out.println("Question: " + randomNum);
            out.print("Your answer: ");
            selectionAnswer = sc.next();

            if (selectionAnswer.equals(correctAnswer)) {
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
        sc.close();
    }
}

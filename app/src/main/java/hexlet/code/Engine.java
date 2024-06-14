package hexlet.code;

import java.util.Scanner;
import static java.lang.System.out;

public class Engine {

    public static <T> void startEngine(int gameNumber) {
        Scanner sc = new Scanner(System.in);
        int selectionAnswer = 0;
        int countCorrectAnswer = 0;
        int correctAnswer = 0;

        while (countCorrectAnswer != 3) {
            out.println("Question: ");
            out.print("Your answer: ");
            selectionAnswer = Integer.parseInt(sc.next());

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

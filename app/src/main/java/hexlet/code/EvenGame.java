package hexlet.code;

import static java.lang.System.out;
import static java.lang.System.in;
import java.util.Scanner;

public class EvenGame {
    static void startEvenGame() {
        Scanner sc = new Scanner(in);
        String selectionAnswer;
        int countCorrectAnswer = 0;
        int randomNum;
        out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        while (true) {
            randomNum = (int) (Math.random() * 10) + 1;
            out.printf("""
                    Question: %d
                    Your answer:\s""", randomNum);
            selectionAnswer = sc.next();

            if (randomNum % 2 == 0 && selectionAnswer.equals("yes")
                    || randomNum % 2 != 0 && selectionAnswer.equals("no")) {
                out.println("Correct!");
                countCorrectAnswer++;
                if (countCorrectAnswer == 3) {
                    out.printf("Congratulations, %s!\n", App.userName);
                    break;
                }
            } else {
                String correctAnswer = randomNum % 2 == 0 ? "yes" : "no";
                out.printf("'%s' is wrong answer ;(. "
                        + "Correct answer was '%s'\n", selectionAnswer, correctAnswer);
                out.println("Let's try again, " + App.userName);
                break;
            }
        }
        sc.close();
    }
}

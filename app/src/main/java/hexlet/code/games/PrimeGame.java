package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;
import static java.lang.System.out;

public class PrimeGame {
    public static void startPrimeGame() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        while (App.countCorrectAnswer < 3) {
            int num = (int) (Math.random() * 1000);

            out.println("Question: " + num);
            if (num == 2 || num == 3 || num == 5 || num == 7) {
                App.correctAnswer = "yes";
            } else {
                App.correctAnswer = num % 2 != 0
                        && num % 3 != 0
                        && num % 5 != 0
                        && num % 7 != 0 ? "yes" : "no";
            }
            Engine.checkAnswer();
        }
        Engine.printEnd();
    }
}

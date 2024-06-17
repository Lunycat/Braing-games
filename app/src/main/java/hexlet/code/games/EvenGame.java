package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;
import static java.lang.System.out;

public class EvenGame {
    public static void startEvenGame() {
        int num;

        out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        while (App.countCorrectAnswer < 3) {
            num = (int) (Math.random() * 10) + 1;
            App.correctAnswer = num % 2 == 0 ? "yes" : "no";
            out.println("Question: " + num);
            Engine.checkAnswer();
        }
        Engine.printEnd();
    }
}

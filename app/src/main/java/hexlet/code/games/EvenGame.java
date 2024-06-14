package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;
import static java.lang.System.out;

public class EvenGame {
    public static void startEvenGame() {
        int randomNum;


        out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        while (App.countCorrectAnswer < 3) {
            randomNum = (int) (Math.random() * 10) + 1;
            App.correctAnswer = randomNum % 2 == 0 ? "yes" : "no";
            out.println("Question: " + randomNum);
            Engine.check();
        }
        Engine.printEnd();
    }
}

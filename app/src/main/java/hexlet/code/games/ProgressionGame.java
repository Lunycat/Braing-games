package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;
import static java.lang.System.out;

public class ProgressionGame {
    public static void startProgressionGame() {
        int sizeOfProgression = (int) (Math.random() * 10) + 5;
        int numOfP = (int) (Math.random() * 10) + 1;
        int summand = (int) (Math.random() * 4) + 1;
        int hidden = (int) (Math.random() * 10) + 1;

        out.println("What number is missing in the progression?");
        while (App.countCorrectAnswer < 3) {
            out.print("Question: ");
            for (int i = 0; i < sizeOfProgression; i++) {
                if (i == hidden) {
                    out.print(".. ");
                    App.correctAnswer = String.valueOf(numOfP);
                } else {
                    out.print(numOfP + " ");
                    numOfP += summand;
                }
            }
            Engine.check();
        }
        Engine.printEnd();
    }
}

package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;
import static java.lang.System.out;

public class ProgressionGame {
    public static void startProgressionGame() {
        out.println("What number is missing in the progression?");
        while (App.countCorrectAnswer < 3) {
            int sizeOfProgression = (int) (Math.random() * 6) + 5;
            int num = (int) (Math.random() * 10) + 1;
            int summand = (int) (Math.random() * 4) + 1;
            int indexOfHiddenNum = (int) (Math.random() * sizeOfProgression);

            out.print("Question: ");
            for (int i = 0; i < sizeOfProgression; i++) {
                if (i == indexOfHiddenNum) {
                    out.print(".. ");
                    App.correctAnswer = String.valueOf(num);
                } else {
                    out.print(num + " ");
                }
                num += summand;
            }
            out.println();
            Engine.checkAnswer();
        }
        Engine.printEnd();
    }
}

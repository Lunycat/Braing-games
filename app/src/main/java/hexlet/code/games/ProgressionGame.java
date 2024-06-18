package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;
import static java.lang.System.out;

public class ProgressionGame {
    public static void startProgressionGame() {
        out.println("What number is missing in the progression?");
        while (App.getCountCorrectAnswer() < App.getRequiredScoreOfCorrectAnswers()) {
            final int maxValueOfNum = 10;
            final int maxValueOfSummand = 4;
            final int maxValueOfProgression = 6;
            final int minValueOfProgression = 5;
            int sizeOfProgression = (int) (Math.random() * maxValueOfProgression) + minValueOfProgression;
            int num = (int) (Math.random() * maxValueOfNum) + 1;
            int summand = (int) (Math.random() * maxValueOfSummand) + 1;
            int indexOfHiddenNum = (int) (Math.random() * sizeOfProgression);

            out.print("Question: ");
            for (int i = 0; i < sizeOfProgression; i++) {
                if (i == indexOfHiddenNum) {
                    out.print(".. ");
                    App.setCorrectAnswer(String.valueOf(num));
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

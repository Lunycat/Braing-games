package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;
import static java.lang.System.out;

public class EvenGame {
    public static void startEvenGame() {
        int num;

        out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        while (App.getCountCorrectAnswer() < App.getRequiredScoreOfCorrectAnswers()) {
            final int maxValueOfNum = 20;
            num = (int) (Math.random() * maxValueOfNum) + 1;
            App.setCorrectAnswer(num % 2 == 0 ? "yes" : "no");
            out.println("Question: " + num);
            Engine.checkAnswer();
        }
        Engine.printEnd();
    }
}

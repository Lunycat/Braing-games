package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;
import static java.lang.System.out;

public class PrimeGame {
    public static void startPrimeGame() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        while (App.getCountCorrectAnswer() < App.getRequiredScoreOfCorrectAnswers()) {
            final int maxValueOfNum = 1000;
            int num = (int) (Math.random() * maxValueOfNum);
            App.setCorrectAnswer("yes");
            out.println("Question: " + num);
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    App.setCorrectAnswer("no");
                    break;
                }
            }
            Engine.checkAnswer();
        }
        Engine.printEnd();
    }
}

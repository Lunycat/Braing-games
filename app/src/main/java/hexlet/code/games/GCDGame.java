package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;
import static java.lang.System.out;

public class GCDGame {
    public static void startGCDGame() {
        int num1;
        int num2;

        out.println("Find the greatest common divisor of given numbers.");
        while (App.getCountCorrectAnswer() < App.getRequiredScoreOfCorrectAnswers()) {
            final int maxValueOfNum = 20;
            num1 = (int) (Math.random() * maxValueOfNum) + 1;
            num2 = (int) (Math.random() * maxValueOfNum) + 1;
            App.setCorrectAnswer(String.valueOf(gcd(num1, num2)));
            out.printf("Question: %s %s\n", num1, num2);
            Engine.checkAnswer();
        }
        Engine.printEnd();
    }

    private static int gcd(int a, int b) {
        return (a % b == 0) ? Math.abs(b) : gcd(b, a % b);
    }
}

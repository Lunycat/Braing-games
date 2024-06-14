package hexlet.code;

import static java.lang.System.out;

public class Engine {

    public static void check() {
        out.print("Your answer: ");
        App.selectionAnswer = App.sc.next();

        if (App.correctAnswer.equals(App.selectionAnswer)) {
            out.println("Correct!");
            App.countCorrectAnswer++;
        } else {
            out.printf("'%s' is wrong answer ;(. "
                    + "Correct answer was '%s'\n", App.selectionAnswer, App.correctAnswer);
            App.countCorrectAnswer = Integer.MAX_VALUE;
        }
    }

    public static void printEnd() {
        if (App.countCorrectAnswer == 3) {
            out.printf("Congratulations, %s!\n", App.userName);
        } else {
            out.printf("Let's try again, %s!\n", App.userName);
        }
    }
}

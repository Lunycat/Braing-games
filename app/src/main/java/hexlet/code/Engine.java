package hexlet.code;

import static java.lang.System.out;

public class Engine {

    public static void checkAnswer() {
        out.print("Your answer: ");
        App.setSelectionAnswer(App.scannerNext());

        if (App.getCorrectAnswer().equals(App.getSelectionAnswer())) {
            out.println("Correct!");
            App.incrementCountCorrectAnswer();
        } else {
            out.printf("'%s' is wrong answer ;(. "
                    + "Correct answer was '%s'.\n", App.getSelectionAnswer(), App.getCorrectAnswer());
            App.setCountCorrectAnswer(Integer.MAX_VALUE);
        }
    }

    public static void printEnd() {
        if (App.getCountCorrectAnswer() == 3) {
            out.printf("Congratulations, %s!\n", App.getUserName());
        } else {
            out.printf("Let's try again, %s!\n", App.getUserName());
        }
    }
}

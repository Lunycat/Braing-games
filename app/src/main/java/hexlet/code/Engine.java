package hexlet.code;

import static java.lang.System.out;

public class Engine {
    public static void startEngine(String[] questions, String[] correctAnswers) {
        String selectionAnswer;
        int indexCorrectAnswer = 0;

        while (indexCorrectAnswer < App.getRequiredScoreOfCorrectAnswers()) {
            out.println("Question: " + questions[indexCorrectAnswer]);
            out.print("Your answer: ");
            selectionAnswer = App.scannerNext();

            if (selectionAnswer.equals(correctAnswers[indexCorrectAnswer])) {
                out.println("Correct!");
                indexCorrectAnswer++;
            } else {
                out.printf("'%s' is wrong answer ;(. "
                        + "Correct answer was '%s'.\n", selectionAnswer, correctAnswers[indexCorrectAnswer]);
                break;
            }
        }

        if (indexCorrectAnswer == App.getRequiredScoreOfCorrectAnswers()) {
            out.printf("Congratulations, %s!\n", App.getUserName());
        } else {
            out.printf("Let's try again, %s!\n", App.getUserName());
        }
    }
}

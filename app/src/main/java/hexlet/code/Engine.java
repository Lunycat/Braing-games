package hexlet.code;

import static java.lang.System.out;

public class Engine {
    public static final int REQUIRED_SCORE_OF_CORRECT_ANSWERS = 3;

    public static void startEngine(String[] questions, String[] correctAnswers) {
        String selectionAnswer;
        int index = 0;

        while (index < REQUIRED_SCORE_OF_CORRECT_ANSWERS) {
            out.println("Question: " + questions[index]);
            out.print("Your answer: ");
            selectionAnswer = App.scannerNext();

            if (selectionAnswer.equals(correctAnswers[index])) {
                out.println("Correct!");
                index++;
            } else {
                out.printf("'%s' is wrong answer ;(. "
                        + "Correct answer was '%s'.\n", selectionAnswer, correctAnswers[index]);
                break;
            }
        }

        if (index == REQUIRED_SCORE_OF_CORRECT_ANSWERS) {
            out.printf("Congratulations, %s!\n", App.getUserName());
        } else {
            out.printf("Let's try again, %s!\n", App.getUserName());
        }
    }
}

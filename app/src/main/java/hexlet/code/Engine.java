package hexlet.code;

import static java.lang.System.out;

public class Engine {
    public static final int REQUIRED_SCORE_OF_CORRECT_ANSWERS = 3;
    public static final int PAIR_OF_QUESTION_AND_ANSWER = 2;

    public static void startEngine(String[][] questionsAndCorrectAnswers) {
        String selectionAnswer;
        String question;
        String correctAnswer;
        int index = 0;

        while (index < REQUIRED_SCORE_OF_CORRECT_ANSWERS) {
            question = questionsAndCorrectAnswers[index][0];
            correctAnswer = questionsAndCorrectAnswers[index][1];

            out.println("Question: " + question);
            out.print("Your answer: ");
            selectionAnswer = App.scannerNext();

            if (selectionAnswer.equals(correctAnswer)) {
                out.println("Correct!");
                index++;
            } else {
                out.printf("'%s' is wrong answer ;(. "
                        + "Correct answer was '%s'.\n", selectionAnswer, correctAnswer);
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

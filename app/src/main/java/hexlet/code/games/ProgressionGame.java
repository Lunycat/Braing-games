package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;
import java.util.StringJoiner;

public class ProgressionGame {
    public static void startProgressionGame() {
        final int maxValueOfNum = 10;
        final int maxValueOfSummand = 4;
        final int maxValueOfProgression = 6;
        final int minValueOfProgression = 5;
        String[] questions = new String[App.getRequiredScoreOfCorrectAnswers()];
        String[] correctAnswers = new String[App.getRequiredScoreOfCorrectAnswers()];

        for (int i = 0; i < App.getRequiredScoreOfCorrectAnswers(); i++) {
            int sizeOfProgression = (int) (Math.random() * maxValueOfProgression) + minValueOfProgression;
            int num = (int) (Math.random() * maxValueOfNum) + 1;
            int summand = (int) (Math.random() * maxValueOfSummand) + 1;
            int indexOfHiddenNum = (int) (Math.random() * sizeOfProgression);
            setQuestionsAndAnswers(questions, correctAnswers, i, sizeOfProgression, indexOfHiddenNum, num, summand);
        }
        System.out.println("What number is missing in the progression?");
        Engine.startEngine(questions, correctAnswers);
    }

    private static void setQuestionsAndAnswers(String[] questions, String[] correctAnswers, int index,
                                               int sizeOfProgression, int indexOfHiddenNum, int num, int summand) {
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 0; i < sizeOfProgression; i++) {
            if (i == indexOfHiddenNum) {
                sj.add("..");
                correctAnswers[index] = (String.valueOf(num));
            } else {
                sj.add(String.valueOf(num));
            }
            num += summand;
        }
        questions[index] = sj.toString();
    }
}

package hexlet.code.games;

import hexlet.code.Engine;
import java.util.StringJoiner;

public class ProgressionGame {
    private static final int MAX_VALUE_OF_NUM = 10;
    private static final int MAX_VALUE_OF_SUMMAND = 4;
    private static final int MAX_VALUE_OF_PROGRESSION = 6;
    private static final int MIN_VALUE_OF_PROGRESSION = 5;

    public static void startProgressionGame() {
        String[][] questionsAndCorrectAnswers =
                new String[Engine.REQUIRED_SCORE_OF_CORRECT_ANSWERS][Engine.PAIR_OF_QUESTION_AND_ANSWER];

        for (int i = 0; i < Engine.REQUIRED_SCORE_OF_CORRECT_ANSWERS; i++) {
            int sizeOfProgression = (int) (Math.random() * MAX_VALUE_OF_PROGRESSION) + MIN_VALUE_OF_PROGRESSION;
            int num = (int) (Math.random() * MAX_VALUE_OF_NUM) + 1;
            int summand = (int) (Math.random() * MAX_VALUE_OF_SUMMAND) + 1;
            int indexOfHiddenNum = (int) (Math.random() * sizeOfProgression);
            questionsAndCorrectAnswers[i][0] = getQuestions(indexOfHiddenNum, sizeOfProgression, num, summand);
            questionsAndCorrectAnswers[i][1] = getCorrectAnswer(indexOfHiddenNum, sizeOfProgression, num, summand);
        }
        System.out.println("What number is missing in the progression?");
        Engine.startEngine(questionsAndCorrectAnswers);
    }


    private static String getQuestions(int indexOfHiddenNum, int sizeOfProgression, int num, int summand) {
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 0; i < sizeOfProgression; i++) {
            if (i == indexOfHiddenNum) {
                sj.add("..");
            } else {
                sj.add(String.valueOf(num));
            }
            num += summand;
        }
        return sj.toString();
    }

    private static String getCorrectAnswer(int indexOfHiddenNum, int sizeOfProgression, int num, int summand) {
        int result = 0;
        for (int i = 0; i < sizeOfProgression; i++) {
            if (i == indexOfHiddenNum) {
                result = num;
            }
            num += summand;
        }
        return String.valueOf(result);
    }
}

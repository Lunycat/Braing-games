package hexlet.code;

import hexlet.code.games.CalculateGame;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GCDGame;
import hexlet.code.games.PrimeGame;
import hexlet.code.games.ProgressionGame;
import java.util.Scanner;
import static java.lang.System.out;

public class App {
    private static String userName;
    private static int countCorrectAnswer = 0;
    private static Scanner scanner;
    private static String selectionAnswer;
    private static String correctAnswer;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int gameNumber;
        int evenGame = 2;
        int calculateGame = 3;
        int gcdGame = 4;
        int progressionGame = 5;
        int primeGame = 6;

        out.print("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                Your choice:\s""");
        gameNumber = scanner.nextInt();

        if (gameNumber > 0 && gameNumber < 7) {
            out.print("""

                Welcome to the Brain Games!
                May I have your name?\s""");
            userName = scanner.next();
            out.printf("Hello, %s!\n", userName);

            if (gameNumber == evenGame) {
                EvenGame.startEvenGame();
            } else if (gameNumber == calculateGame) {
                CalculateGame.startCalculateGame();
            } else if (gameNumber == gcdGame) {
                GCDGame.startGCDGame();
            } else if (gameNumber == progressionGame) {
                ProgressionGame.startProgressionGame();
            } else if (gameNumber == primeGame) {
                PrimeGame.startPrimeGame();
            }
            scanner.close();
        }
    }

    public static int getCountCorrectAnswer() {
        return countCorrectAnswer;
    }

    public static String getUserName() {
        return userName;
    }

    public static String getCorrectAnswer() {
        return correctAnswer;
    }

    public static String getSelectionAnswer() {
        return selectionAnswer;
    }


    public static void setCorrectAnswer(String correctAnswer) {
        App.correctAnswer = correctAnswer;
    }

    public static void setCountCorrectAnswer(int i) {
        countCorrectAnswer = i;
    }

    public static void incrementCountCorrectAnswer() {
        countCorrectAnswer += 1;
    }

    public static void setSelectionAnswer(String selectionAnswer) {
        App.selectionAnswer = selectionAnswer;
    }

    public static String scannerNext() {
        return scanner.next();
    }
}

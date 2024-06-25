package hexlet.code;

import hexlet.code.games.EvenGame;
import hexlet.code.games.CalculateGame;
import hexlet.code.games.GCDGame;
import hexlet.code.games.ProgressionGame;
import hexlet.code.games.PrimeGame;

import java.util.Scanner;
import static java.lang.System.out;

public class App {
    private static String userName;
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int gameNumber;
        final int evenGame = 2;
        final int calculateGame = 3;
        final int gdcGame = 4;
        final int progressionGame = 5;
        final int primeGame = 6;

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

        if (gameNumber > 0 && gameNumber <= primeGame) {
            out.print("""

                Welcome to the Brain Games!
                May I have your name?\s""");
            userName = scanner.next();
            out.printf("Hello, %s!\n", userName);

            if (gameNumber == evenGame) {
                EvenGame.startEvenGame();
            } else if (gameNumber == calculateGame) {
                CalculateGame.startCalculateGame();
            } else if (gameNumber == gdcGame) {
                GCDGame.startGCDGame();
            } else if (gameNumber == progressionGame) {
                ProgressionGame.startProgressionGame();
            } else if (gameNumber == primeGame) {
                PrimeGame.startPrimeGame();
            }
            scanner.close();
        }
    }

    public static String getUserName() {
        return userName;
    }

    public static String scannerNext() {
        return scanner.next();
    }
}

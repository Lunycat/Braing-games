package hexlet.code;

import hexlet.code.games.CalculateGame;
import hexlet.code.games.EvenGame;
import java.util.Scanner;
import static java.lang.System.out;

public class App {
    public static String userName;
    public static int countCorrectAnswer = 0;
    public static Scanner sc;
    public static String selectionAnswer;
    public static String correctAnswer;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int gameNumber;

        out.print("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                0 - Exit
                Your choice:\s""");
        gameNumber = sc.nextInt();

        if (gameNumber > 0) {
            out.print("""

                    Welcome to the Brain Games!
                    May I have your name?\s""");
            userName = sc.next();
            out.printf("Hello, %s!\n", userName);
        }

        if (gameNumber == 2) {
            EvenGame.startEvenGame();
        }

        if (gameNumber == 3) {
            CalculateGame.startCalculateGame();
        }
        sc.close();
    }
}

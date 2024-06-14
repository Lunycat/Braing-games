package hexlet.code;

import hexlet.code.games.CalculateGame;
import hexlet.code.games.EvenGame;
import static java.lang.System.out;
import static java.lang.System.in;
import java.util.Scanner;

public class App {
    public static String userName;

    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int selectionNum;

        out.print("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                0 - Exit
                Your choice:\s""");
        selectionNum = sc.nextInt();

        if (selectionNum > 0) {
            out.print("""

                    Welcome to the Brain Games!
                    May I have your name?\s""");
            userName = sc.next();
            out.printf("Hello, %s!\n", userName);
        }

        if (selectionNum == 2) {
            EvenGame.startEvenGame();
        }

        if (selectionNum == 3) {
            CalculateGame.startCalculateGame();
        }
        sc.close();
    }
}

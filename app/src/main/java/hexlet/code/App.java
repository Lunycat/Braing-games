package hexlet.code;

import java.util.Scanner;

public class App {
    static String userName;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int selectionNum;

        System.out.print("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                0 - Exit
                Your choice:\s""");
        selectionNum = sc.nextInt();

        if (selectionNum > 0) {
            System.out.print("""
                                        
                    Welcome to the Brain Games!
                    May I have your name?\s""");
            userName = sc.next();
            System.out.printf("Hello, %s!\n", userName);
        }

        if (selectionNum == 2) {
            EvenGame.startEvenGame();
        }
        sc.close();
    }
}

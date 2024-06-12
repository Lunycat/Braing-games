package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int selectionNum;
        String selectionAnswer;
        int countCorrectAnswer = 0;
        String userName;

        System.out.print("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                0 - Exit
                Your choice:\s""");
        selectionNum = sc.nextInt();
        System.out.println();
        System.out.print("""
                Welcome to the Brain Games!
                May I have your name?\s""");
        userName = sc.next();
        System.out.println("Hello, " + userName + "!");

        if (selectionNum == 2) {
            while (countCorrectAnswer != 3) {
                System.out.print("""
                    Answer 'yes' if the number is even, otherwise answer 'no'.");
                    Question:\s""");
                selectionAnswer = sc.next();
                System.out.println("Your answer: " + selectionAnswer);
                if (Integer.parseInt(selectionAnswer) % 2 == 0 && selectionAnswer.equals("yes")
                        || Integer.parseInt(selectionAnswer) % 2 != 0 && selectionAnswer.equals("no")) {
                    System.out.println("Correct!");
                    countCorrectAnswer++;
                } else {
                    String correctAnswer = selectionAnswer.equals("yes") ? "no" : "yes";
                    System.out.println("'" + selectionAnswer + "' is wrong answer ;(. "
                            + "Correct answer was '" + correctAnswer + "'");
                    System.out.println("Let's try again, " + userName);
                    break;
                }
            }
        }
        sc.close();
    }
}

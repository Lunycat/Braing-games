package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void start() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Welcome to the Brain Games!\n" +
                "May I have your name? ");
        String userName = sc.next();
        System.out.println("Hello, " + userName + "!");
        sc.close();
    }
}

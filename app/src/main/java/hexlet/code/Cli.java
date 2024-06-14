package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greet() {
        Scanner sc = new Scanner(System.in);
        System.out.print("""
                Welcome to the Brain Games!
                May I have your name?\s""");
        String userName = sc.next();
        System.out.println("Hello, " + userName + "!");
        sc.close();
    }
}
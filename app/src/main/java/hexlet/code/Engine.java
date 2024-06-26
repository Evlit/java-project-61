package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int COUNTGAMES = 3;
    public static void game(String rule, String[][] data) {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String name = s.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println(rule);

        for (int i = 0; i < COUNTGAMES; i++) {
            System.out.println(data[i][0]);
            System.out.println("Your answer:");
            String answer = s.nextLine();
            if (data[i][1].equals(answer.toLowerCase())) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. "
                        + "Correct answer was " + "'" + data[i][1] + "'" + ".");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}

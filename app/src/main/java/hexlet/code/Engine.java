package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void game(String rule, String[][] data) {
        Scanner s = new Scanner(System.in);
        String name = Greeting.getMame();
        System.out.println(rule);

        for (int i = 0; i < ConfigRandom.COUNTGAMES; i++) {
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

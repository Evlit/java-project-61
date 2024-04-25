package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class GameSelect {
    static final int COUNTGAMES = 3;
    public static void game(int gameNumber) {
        String namePlayer = Greeting.getMame();
        System.out.println("Hello, " + namePlayer);
        switch (gameNumber) {
//            case 1:
//                break;
            case 2:
                System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
                int correct = 0;
                Random random = new Random();
                while (correct < COUNTGAMES) {
                    int randomNumber = random.nextInt(100);
                    System.out.println("Question: " + randomNumber);
                    Scanner s = new Scanner(System.in);
                    System.out.println("Your answer:");
                    String answer = s.nextLine();
                    String correctAnswer = Check.isCorrect(randomNumber);
                    if (correctAnswer.equals(answer.toLowerCase())) {
                        System.out.println("Correct!");
                        correct++;

                    } else {
                        System.out.println("'" + answer.toLowerCase() + "'" + " is wrong answer ;(. "
                                + "Correct answer was " + "'" + correctAnswer + "'" + ".");
                        System.out.println("Let's try again, " + namePlayer + "!");
                        break;
                    }

                }
                if (correct == 3) {
                    System.out.println("Congratulations, " + namePlayer + "!");
                }
            default:
                break;
        }
    }
}

package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;
import hexlet.code.Check;

public class Prime {
    public static void primeGame(Random random, int countGames, String namePlayer, Scanner s) {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        int correct = 0;
        while (correct < countGames) {
            int randomNumber = random.nextInt(100);
            System.out.println("Question: " + randomNumber);
            System.out.println("Your answer:");
            String answer = s.nextLine();
            String correctAnswer = Check.checkPrime(randomNumber);
            if (correctAnswer.equals(answer.toLowerCase())) {
                System.out.println("Correct!");
                correct++;
            } else {
                Check.failed(correctAnswer, answer.toLowerCase(), namePlayer);
                break;
            }
        }
        if (correct == 3) {
            System.out.println("Congratulations, " + namePlayer + "!");
        }
    }
}

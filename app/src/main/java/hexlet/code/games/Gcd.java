package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;
import hexlet.code.Check;

public class Gcd {
    public static void gcdGame(Random random, int countGames, String namePlayer, Scanner s) {
        final int randomA = 100;
        final int randomB = 100;
        System.out.println("Find the greatest common divisor of given numbers.");
        int correct = 0;
        while (correct < countGames) {
            int numberA = random.nextInt(randomA);
            int numberB = random.nextInt(randomB);
            System.out.println("Question: " + numberA + " "  + numberB);
            System.out.println("Your answer:");
            String answer = s.nextLine();
            String correctAnswer = Check.checkGcd(numberA, numberB);
            if (correctAnswer.equals(answer.toLowerCase())) {
                System.out.println("Correct!");
                correct++;
            } else {
                Check.failed(correctAnswer, answer.toLowerCase(), namePlayer);
                break;
            }
        }
        if (correct == countGames) {
            System.out.println("Congratulations, " + namePlayer + "!");
        }
    }
}

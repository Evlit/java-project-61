package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

import hexlet.code.Check;

public class Even {
    public static void evenGame(Random random, int countGames, String namePlayer, Scanner s) {
        final int randomInt = 100;
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int correct = 0;
        while (correct < countGames) {
            int randomNumber = random.nextInt(randomInt);
            System.out.println("Question: " + randomNumber);
            System.out.println("Your answer:");
            String answer = s.nextLine();
            String correctAnswer = Check.checkEven(randomNumber);
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

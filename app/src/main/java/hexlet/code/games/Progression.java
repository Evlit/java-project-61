package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;
import hexlet.code.Check;

public class Progression {
    public static void progressionGame(Random random, int countGames, String namePlayer, Scanner s) {
        System.out.println("What number is missing in the progression?");
        int correct = 0;
        while (correct < countGames) {
            int start = random.nextInt(50);
            int step = random.nextInt(2, 6);
            int blank = random.nextInt(10);
            String[] numbers = Check.getProgression(start, step);
            String correctAnswer = numbers[blank];
            numbers[blank] = "..";
            String question = String.join(" ", numbers);
            System.out.println("Question: " + question);
            System.out.println("Your answer:");
            String answer = s.nextLine();
            if (!correctAnswer.equals(answer.toLowerCase())) {
                Check.failed(correctAnswer, answer.toLowerCase(), namePlayer);
                break;
            }
            System.out.println("Correct!");
            correct++;
        }
        if (correct == 3) {
            System.out.println("Congratulations, " + namePlayer + "!");
        }
    }
}

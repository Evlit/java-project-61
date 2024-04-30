package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;
import hexlet.code.Check;

public class Progression {
    public static void progressionGame(Random random, int countGames, String namePlayer, Scanner s) {
        System.out.println("What number is missing in the progression?");
        int[] amount = new int[10];
        int correct = 0;
        while (correct < countGames) {
            int start = random.nextInt(50);
            int step = random.nextInt(2,6);
            int blank = random.nextInt(10);
            String question = "";
            amount[0] = start;
            for (int i = 1; i < amount.length; i++) {
                amount[i] = amount[i - 1] + step;
            }
            for (int i = 0; i < amount.length; i++) {
                if (i == blank) {
                    question = question + " ..";

                } else {
                    question = question + " " + amount[i];
                }
            }

            System.out.println("Question: " + question);
            System.out.println("Your answer:");
            String answer = s.nextLine();
            String correctAnswer = amount[blank] + "";
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

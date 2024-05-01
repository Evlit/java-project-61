package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;
import hexlet.code.Check;

public class Calc {
    public static void calculator(Random random, int countGames, String namePlayer, Scanner s) {
        String[] operators = {"+", "-", "*"};
        final int randomOper = 3;
        final int randomA = 20;
        final int randomB = 20;
        System.out.println("What is the result of the expression?");
        int correct = 0;
        while (correct < countGames) {
            int i = random.nextInt(randomOper);
            String operator = operators[i];
            int numberA = random.nextInt(randomA);
            int numberB = random.nextInt(randomB);
            System.out.println("Question: " + numberA + " " + operator + " " + numberB);
            System.out.println("Your answer:");
            String answer = s.nextLine();
            String correctAnswer = Check.checkCalc(numberA, numberB, operator);
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

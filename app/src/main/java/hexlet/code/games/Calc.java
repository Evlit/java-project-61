package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;
import hexlet.code.Check;

public class Calc {
    public static void calculator(Random random, int countGames, String namePlayer) {
        String[] operators = {"+", "-", "*"};
        System.out.println("What is the result of the expression?");
        int correct = 0;
        while (correct < countGames) {
            int i = random.nextInt(3);
            String operator = operators[i];
            int numberA = random.nextInt(20);
            int numberB = random.nextInt(20);
            System.out.println("Question: " + numberA + " " + operator + " " + numberB);
            Scanner s = new Scanner(System.in);
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
        if (correct == 3) {
            System.out.println("Congratulations, " + namePlayer + "!");
        }
    }
}

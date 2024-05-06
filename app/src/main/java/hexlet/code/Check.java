package hexlet.code;

import java.util.Random;

public class Check {
    public static String checkEven(int number) {
        if (number % 2 == 0) {
            return "yes";
        }
        return "no";
    }

    public static String checkCalc(int numberA, int numberB, String operator) {
        int result;
        switch (operator) {
            case "+":
                result = numberA + numberB;
                break;
            case "-":
                result = numberA - numberB;
                break;
            default:
                result = numberA * numberB;
                break;
        }
        return result + "";
    }

    public static String checkGcd(int numberA, int numberB) {
        int count = Math.min(numberA, numberB);
        for (int n = count; n >= 1; n--) {
            if (numberA % n == 0 && numberB % n == 0) {
                count = n;
                break;
            }
        }
        return count + "";
    }

    public static String checkPrime(int number) {
        if (number < 2) {
            return "no";
        }
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return "no";
            }
        }
        return "yes";
    }

    public static String[] getProgression(int start, int step) {
        final int longArray = 10;
        int[] amount = new int[longArray];
        String[] string = new String[longArray];
        amount[0] = start;
        string[0] = String.valueOf(start);
        for (int i = 1; i < amount.length; i++) {
            amount[i] = amount[i - 1] + step;
            string[i] = String.valueOf(amount[i]);
        }
        return string;
    }

    public static int getRandom(int number) {
        Random random = new Random();
        int newRandom = random.nextInt(number);
        return newRandom;
    }

    public static int getRandom(int position, int number) {
        Random random = new Random();
        int newRandom = random.nextInt(position, number);
        return newRandom;
    }
}

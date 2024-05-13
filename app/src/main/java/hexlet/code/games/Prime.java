package hexlet.code.games;

import hexlet.code.Util;
import hexlet.code.Engine;

public class Prime {
    public static final int MAX_RANDOM_PRIME_GAME = 100;
    public static void primeGame() {
        String rule = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] data = new String[Engine.COUNTGAMES][2];
        for (int i = 0; i < Engine.COUNTGAMES; i++) {
            int randomNumber = Util.getRandom(MAX_RANDOM_PRIME_GAME);
            data[i][0] = "Question: " + randomNumber;
            data[i][1] = checkPrime(randomNumber) ? "yes" : "no";
        }
        Engine.game(rule, data);
    }

    public static boolean checkPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

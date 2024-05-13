package hexlet.code.games;

import hexlet.code.Util;
import hexlet.code.Engine;

public class Gcd {
    public static final int A_RANDOM_GCD_GAME = 100;
    public static final int B_RANDOM_GCD_GAME = 100;
    public static void gcdGame() {
        String rule = "Find the greatest common divisor of given numbers.";
        String[][] data = new String[Engine.COUNTGAMES][2];
        for (int i = 0; i < Engine.COUNTGAMES; i++) {
            int numberA = Util.getRandom(A_RANDOM_GCD_GAME);
            int numberB = Util.getRandom(B_RANDOM_GCD_GAME);
            data[i][0] = "Question: " + numberA + " " + numberB;
            data[i][1] = String.valueOf(checkGcd(numberA, numberB));
        }
        Engine.game(rule, data);
    }

    public static int checkGcd(int numberA, int numberB) {
        int count = Math.min(numberA, numberB);
        for (int n = count; n >= 1; n--) {
            if (numberA % n == 0 && numberB % n == 0) {
                count = n;
                break;
            }
        }
        return count;
    }
}

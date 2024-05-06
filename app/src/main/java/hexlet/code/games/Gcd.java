package hexlet.code.games;

import hexlet.code.Check;
import hexlet.code.ConfigRandom;
import hexlet.code.Engine;

public class Gcd {
    public static void gcdGame() {
        String rule = "Find the greatest common divisor of given numbers.";
        String[][] data = new String[ConfigRandom.COUNTGAMES][2];
        for (int i = 0; i < ConfigRandom.COUNTGAMES; i++) {
            int numberA = Check.getRandom(ConfigRandom.A_RANDOM_GCD_GAME);
            int numberB = Check.getRandom(ConfigRandom.B_RANDOM_GCD_GAME);
            data[i][0] = "Question: " + numberA + " " + numberB;
            data[i][1] = Check.checkGcd(numberA, numberB);
        }
        Engine.game(rule, data);
    }
}

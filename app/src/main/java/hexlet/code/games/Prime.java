package hexlet.code.games;

import hexlet.code.Check;
import hexlet.code.ConfigRandom;
import hexlet.code.Engine;

public class Prime {
    public static void primeGame() {
        String rule = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] data = new String[ConfigRandom.COUNTGAMES][2];
        for (int i = 0; i < ConfigRandom.COUNTGAMES; i++) {
            int randomNumber = Check.getRandom(ConfigRandom.MAX_RANDOM_PRIME_GAME);
            data[i][0] = "Question: " + randomNumber;
            data[i][1] = Check.checkPrime(randomNumber);
        }
        Engine.game(rule, data);
    }
}

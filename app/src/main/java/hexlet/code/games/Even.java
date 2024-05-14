package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Even {
    public static final int MAX_RANDOM_EVEN_GAME = 100;

    public static void evenGame() {
        String rule = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] data = new String[Engine.COUNTGAMES][2];
        for (int i = 0; i < Engine.COUNTGAMES; i++) {
            int randomNumber = Util.getRandom(MAX_RANDOM_EVEN_GAME);
            data[i][0] = "Question: " + randomNumber;
            data[i][1] = checkEven(randomNumber) ? "yes" : "no";
        }
        Engine.game(rule, data);
    }

    public static boolean checkEven(int number) {
        return number % 2 == 0;
    }
}

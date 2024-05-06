package hexlet.code.games;

import hexlet.code.Check;
import hexlet.code.ConfigRandom;
import hexlet.code.Engine;

public class Even {
    public static void evengame() {
        String rule = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] data = new String[ConfigRandom.COUNTGAMES][2];
        for (int i = 0; i < ConfigRandom.COUNTGAMES; i++) {
            int randomNumber = Check.getRandom(ConfigRandom.MAX_RANDOM_EVEN_GAME);
            data[i][0] = "Question: " + randomNumber;
            data[i][1] = Check.checkEven(randomNumber);
        }
        Engine.game(rule, data);
    }
}

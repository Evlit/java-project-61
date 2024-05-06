package hexlet.code.games;

import hexlet.code.Check;
import hexlet.code.ConfigRandom;
import hexlet.code.Engine;

public class Progression {
    public static void progressionGame() {
        String rule = "What number is missing in the progression?";
        String[][] data = new String[ConfigRandom.COUNTGAMES][2];
        for (int i = 0; i < ConfigRandom.COUNTGAMES; i++) {
            int start = Check.getRandom(ConfigRandom.START_RANDOM_PROGRESSION_GAME);
            int step = Check.getRandom(ConfigRandom.POSITION_RANDOM_PROGRESSION_GAME,
                    ConfigRandom.STEP_RANDOM_PROGRESSION_GAME);
            int blank = Check.getRandom(ConfigRandom.BLANK_RANDOM_PROGRESSION_GAME);
            String[] numbers = Check.getProgression(start, step);
            String correctAnswer = numbers[blank];
            numbers[blank] = "..";
            String question = String.join(" ", numbers);
            data[i][0] = "Question: " + question;
            data[i][1] = correctAnswer;
        }
        Engine.game(rule, data);
    }
}

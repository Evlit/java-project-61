package hexlet.code.games;

import hexlet.code.Util;
import hexlet.code.Engine;

public class Progression {
    public static final int START_RANDOM_PROGRESSION_GAME = 50;
    public static final int STEP_RANDOM_PROGRESSION_GAME = 6;
    public static final int POSITION_RANDOM_PROGRESSION_GAME = 2;
    public static final int BLANK_RANDOM_PROGRESSION_GAME = 10;
    public static void progressionGame() {
        String rule = "What number is missing in the progression?";
        String[][] data = new String[Engine.COUNTGAMES][2];
        for (int i = 0; i < Engine.COUNTGAMES; i++) {
            int start = Util.getRandom(START_RANDOM_PROGRESSION_GAME);
            int step = Util.getRandom(POSITION_RANDOM_PROGRESSION_GAME, STEP_RANDOM_PROGRESSION_GAME);
            int blank = Util.getRandom(BLANK_RANDOM_PROGRESSION_GAME);
            String[] numbers = getProgression(start, step);
            String correctAnswer = numbers[blank];
            numbers[blank] = "..";
            String question = String.join(" ", numbers);
            data[i][0] = "Question: " + question;
            data[i][1] = correctAnswer;
        }
        Engine.game(rule, data);
    }

    public static String[] getProgression(int start, int step) {
        final int longArray = 10;
        String[] string = new String[longArray];
        for (int i = 0; i < string.length; i++) {
            string[i] = String.valueOf(start + i * step);
        }
        return string;
    }
}

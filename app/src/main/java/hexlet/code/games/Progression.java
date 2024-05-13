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
}

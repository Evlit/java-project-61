package hexlet.code.games;

import hexlet.code.Check;
import hexlet.code.ConfigRandom;
import hexlet.code.Engine;

public class Calc {
    public static void calculator() {
        String[] operators = {"+", "-", "*"};
        String[][] data = new String[ConfigRandom.COUNTGAMES][2];
        String rule = "What is the result of the expression?";

        for (int i = 0; i < ConfigRandom.COUNTGAMES; i++) {
            int randomOper = Check.getRandom(ConfigRandom.OPER_RANDOM_CALC_GAME);
            String operator = operators[randomOper];
            int numberA = Check.getRandom(ConfigRandom.A_RANDOM_CALC_GAME);
            int numberB = Check.getRandom(ConfigRandom.B_RANDOM_CALC_GAME);
            data[i][0] = "Question: " + numberA + " " + operator + " " + numberB;
            data[i][1] = Check.checkCalc(numberA, numberB, operator);
        }
        Engine.game(rule, data);
    }
}

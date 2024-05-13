package hexlet.code.games;

import hexlet.code.Util;
import hexlet.code.Engine;

public class Calc {
    public static final int OPER_RANDOM_CALC_GAME = 3;
    public static final int A_RANDOM_CALC_GAME = 20;
    public static final int B_RANDOM_CALC_GAME = 20;
    public static void calculator() {
        String[] operators = {"+", "-", "*"};
        String[][] data = new String[Engine.COUNTGAMES][2];
        String rule = "What is the result of the expression?";

        for (int i = 0; i < Engine.COUNTGAMES; i++) {
            int randomOper = Util.getRandom(OPER_RANDOM_CALC_GAME);
            String operator = operators[randomOper];
            int numberA = Util.getRandom(A_RANDOM_CALC_GAME);
            int numberB = Util.getRandom(B_RANDOM_CALC_GAME);
            data[i][0] = "Question: " + numberA + " " + operator + " " + numberB;
            data[i][1] = String.valueOf(checkCalc(numberA, numberB, operator));
        }
        Engine.game(rule, data);
    }

    public static int checkCalc(int numberA, int numberB, String operator) {
        int result;
        switch (operator) {
            case "+":
                result = numberA + numberB;
                break;
            case "-":
                result = numberA - numberB;
                break;
            default:
                result = numberA * numberB;
        }
        return result;
    }
}
